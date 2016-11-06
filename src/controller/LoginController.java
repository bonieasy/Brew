package controller;

import model.UsuarioDAO;
import model.Usuario;

public class LoginController {
	
	public boolean validarLogin(Usuario usuario) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
        if (!usuarioDAO.bd.getConnection()) {
            System.out.println("Falha na conexão com o Banco de Dados!");
            System.exit(0);
        }
    
        return (usuarioDAO.consultar(usuario));     
	}

}
