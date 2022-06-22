package br.inatel.C207.DB;
import br.inatel.C207.Class.Cadastro;
import java.sql.SQLException;

public class CadastroDB extends Database{
    public boolean insertCadastro(Cadastro cadastro){ // Inserindo Paciente no banco de dados
        connect();    //Conectando no banco
        String sql = "INSERT INTO CadastroDB(idCadastro) VALUES(?)";  //Comando utilizado no Sql transcrevido em TEXTO
        try{                    //Comandos utlizados sem o erro
            pst = connection.prepareStatement(sql);   //preparando conexao
            pst.setInt(1,cadastro.getIdCadastro());    //preparando Query para nomePaciente


            pst.execute();    // Executar
            check = true;     // passando valor true para check (controle de erro)
        }catch(SQLException e){  // SQLException (Ocorreu erro)
            System.out.println("Erro de operação: " +e.getMessage());   //Mensagem de erro
            check = false;   //Passando valor pra false para check (Controle de erro)
        }
        finally{    // Ao final da execuçao
            try{
                connection.close();   //fechar conexao
                pst.close();
            }catch(SQLException e){  //Se nao conseguir fechar conexao
                System.out.println("Erro ao fechar a conexao: "+e.getMessage());  // Erro de encerramento de conexao
            }
        }
        return check;  //retornando check
    }
}
