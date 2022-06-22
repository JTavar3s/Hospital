package br.inatel.C207.DB;

import java.sql.SQLException;

public class MedicoDB extends Database {
    public MedicoDB(){
    }
    public boolean updateMedico(String nome,int id,int idade,String Setor){ //atualizar dados do atendente
        connect();
        String sql = "UPDATE medicoDB SET nome =? WHERE idade =? AND setor=? AND id=?"; //Comando utilizado no Sql transcrevido em TEXTO
        try{
            pst = connection.prepareStatement(sql); //preparando conexao
            pst.setString(1,nome);     //preparando Query para nome
            pst.setInt (2,idade);   //preparando Query para idade
            pst.setInt(4,id);
                pst.setString(3,Setor); //preparando Query para Setor
            pst.execute();  //executar
            check = true;  // variavel de controle foi para true
        }catch(SQLException e){  //Se der erro
            System.out.println("Erro de operação: "+ e.getMessage());  //mostrar mensagem
            check= false;  // variavel de controle foi para false
        }finally{  //ao final fechar execuçoes
            try{
                connection.close();  //fechar variavel de conexao
                pst.close();   //fechar variavel de manipulacao
            }catch(SQLException e){  // se der erro
                System.out.println("Erro ao fechar a conexão: "+e.getMessage()); // mostrar mensagem de erro
            }
        }
        return check; //retornar variavel de controle
    }

}
