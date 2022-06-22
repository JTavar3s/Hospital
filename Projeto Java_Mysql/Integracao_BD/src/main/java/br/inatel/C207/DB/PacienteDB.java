package br.inatel.C207.DB;

import java.sql.SQLException;

public class PacienteDB extends Database {

    public PacienteDB(){
    }

    public boolean updatePaciente(String nomePaciente,int idPaciente,int idade){ //atualizar dados do atendente
        connect();
        String sql = "UPDATE pacienteDB SET nomePaciente =? WHERE idPaciente =? AND idade=?"; //Comando utilizado no Sql transcrevido em TEXTO
        try{
            pst = connection.prepareStatement(sql); //preparando conexao
            pst.setString(1,nomePaciente);   // preparando Query para nomePaciente
            pst.setInt (2,idPaciente);   //preparando Query para idPacienteDB
            pst.setInt(3,idade);
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
