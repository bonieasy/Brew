package model;

import service.BD;
import java.sql.*;

public class UsuarioDAO {
    public BD bd;
    private PreparedStatement statement;
    private ResultSet result;
    private String sql;
  
    public UsuarioDAO() {
        bd = new BD();
    }
    
    public boolean consultar(Usuario usuario) {
        sql = "SELECT * from usuario WHERE nome_usuario = ? AND senha_usuario = ?";
        try {
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, usuario.getUsuario());
    		statement.setString(2, usuario.getSenha());     
            result = statement.executeQuery();
            if (result.next())
            	return true;      
            else
            	return false;
        } catch (SQLException erro) {
            System.out.println("Erro: " +erro.toString());
            return false;
        }               
    }     
}    
    
