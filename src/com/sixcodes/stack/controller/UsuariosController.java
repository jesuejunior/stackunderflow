package com.sixcodes.stack.controller;

import java.util.List;


import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;

import com.sixcodes.stack.dao.UsuarioDAO;
import com.sixcodes.stack.model.Usuario;
import com.sixcodes.stack.component.UsuarioWeb;

@Resource
public class UsuariosController {
	private final UsuarioDAO dao;
	private final Result result;
	private final Validator validator;
	private final UsuarioWeb usuarioWeb;
	
	public UsuariosController(UsuarioDAO dao, Result result, Validator validator, UsuarioWeb usuarioWeb){
		this.dao = dao;
		this.result = result;
		this.validator = validator;
		this.usuarioWeb = usuarioWeb;
	}
	
	@Get("/usuarios/list")
	public List<Usuario> list(){
		return dao.allUsers();
	}
	
	@Post("/usuarios")
	public void add(Usuario usuario){
		if(dao.existeUsuario(usuario)){
			validator.add(new ValidationMessage("Usuário já está cadastrado, por favor tente outro", "usuario.username"));
		}
		validator.onErrorUsePageOf(UsuariosController.class).novo();
		dao.save(usuario);
		result.redirectTo(QuestionsController.class).list();
	}
	
	@Get("/usuarios/novo")
	public void novo() {
		
	}
	 
	@Get("/login")
	public void loginForm() {
		
	}
	
	@Post("/login")
    public void login(Usuario usuario) {
        Usuario carregado = dao.getUsuarioLogin(usuario);
        if (carregado == null) {
            validator.add(new ValidationMessage("Login e/ou senha inválidos","${usuario.username}"));
        }
        validator.onErrorUsePageOf(UsuariosController.class).loginForm();
        usuarioWeb.login(carregado);
        result.redirectTo(QuestionsController.class).list();
	}
	
	@Path("/logout")
	public void logout(){
		usuarioWeb.logout();
		result.redirectTo(QuestionsController.class).list();
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
