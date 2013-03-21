package com.sixcodes.stack.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import static br.com.caelum.vraptor.view.Results.*;

import com.sixcodes.stack.dao.UsuarioDAO;
import com.sixcodes.stack.model.Usuario;

@Resource
public class UsuariosController {
	private final UsuarioDAO dao;
	private final Result result;
	
	public UsuariosController(UsuarioDAO dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	@Path("/usuarios/all.json")
	@Get
	public void list(){
		 result.use(json()).from(dao.allUsers()).serialize();
	}
	@Path("/usuarios")
	@Post
	public void add(Usuario usuario){
		dao.save(usuario);
	}
}
