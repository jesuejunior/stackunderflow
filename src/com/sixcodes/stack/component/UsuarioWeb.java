package com.sixcodes.stack.component;
import java.io.Serializable;

import com.sixcodes.stack.model.Usuario;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class UsuarioWeb implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario logado;
	public void login(Usuario usuario){
		this.logado = usuario;
	}
	public String getNome(){
		return logado.getFirstname();
	}
	
	public Long getId(){
		return logado.getId();
	}
	
	public boolean isLogado(){
		return logado != null;
	}
	public void logout(){
		this.logado = null;
	}
}
