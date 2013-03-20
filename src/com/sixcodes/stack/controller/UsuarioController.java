package com.sixcodes.stack.controller;

import java.util.List;

import com.sixcodes.stack.dao.UsuarioDAO;
import com.sixcodes.stack.model.Usuario;

public class UsuarioController {
	
	public List<Usuario> list(){
		UsuarioDAO dao = new UsuarioDAO();
		return dao.allUsers();
	}

}
