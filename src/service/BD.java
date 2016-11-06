package service;
import java.sql.*;
public class BD {
    public Connection connection = null;
    private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String DBNAME = "BS";
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=" + DBNAME;
    private final String LOGIN = "sa";
    private final String SENHA = "erica123";

    /**
     * metodo que faz conexao com o banco de dados
     * retorna true se houve sucesso, ou false em caso negativo
     */
    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou");
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver nao encontrado " + erro.toString());
            return false;
        } catch (SQLException erro) {
            System.out.println("Falha ao conectar " + erro.toString());
            return false;
        }
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {}
    }
}
