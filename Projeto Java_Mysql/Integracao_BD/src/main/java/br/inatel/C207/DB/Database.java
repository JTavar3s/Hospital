package br.inatel.C207.DB;

import java.sql.*;
import java.util.ArrayList;

public abstract class Database {
    Connection connection; // objeto responsável por fazer a conexão com mysql
    Statement statement; // objeto responsável por preparar consultas "SELECT"
    ResultSet result; // objeto responsável por executar consultas "SELECT"
    PreparedStatement pst; // objeto responsável por preparar querys de manipulação dinâmica(INSERT, UPDATE, DELETE)

    static final String user = "root"; // usuário da instância local do servidor
    static final String password = "Lokoporti321#123"; // senha do usuário da instância local do servidor
    static final String database = "mydb"; // nome do banco de dados a ser utilizado

    // String com URL de conexão com o servidor
    static final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public boolean check = false;

    public void connect() {

        try {
            connection = DriverManager.getConnection(url, user, password);  //Coletando a conexão
            System.out.println("Conexao feita com sucesso: "+connection);
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }
    }
}
