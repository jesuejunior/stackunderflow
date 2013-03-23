package com.sixcodes.stack.controller;

import java.util.List;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.deserialization.Deserializes;
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
	
	@Path("/usuario/list")
	@Get
	public List<Usuario> list(){
		return dao.allUsers();
	}
	
	@Path("/usuario/add")
	@Post
	public void add(Usuario usuario ){
		dao.save(usuario);
		result.redirectTo(this).list();
	}
	
	@Path("/usuario/edit")
	@Put
	public void edit(Usuario usuario){
		dao.edit(usuario);
		result.redirectTo(this).list();
	}
	@Path("/usuario/remove")
	@Delete
	public void remove(Long id){
		Usuario usuario = dao.load(id);
		dao.remove(usuario);
		result.redirectTo(UsuariosController.class).list();
	}
}
