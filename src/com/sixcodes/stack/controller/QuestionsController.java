package com.sixcodes.stack.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.sixcodes.stack.component.UsuarioWeb;
import com.sixcodes.stack.dao.QuestionDAO;
import com.sixcodes.stack.model.Question;

@Resource
public class QuestionsController {
	
	private final QuestionDAO dao;
	private final Result result;
	private final  UsuarioWeb usuarioWeb;
	
	public QuestionsController(QuestionDAO dao, Result result,  UsuarioWeb usuarioWeb) {
		this.dao = dao;
		this.result = result;
		this.usuarioWeb = usuarioWeb;
		}
	@Get("/questions/nova")
	public void nova(){
	}

	@Get("/questions/list")
	public List<Question> list() {
		return dao.allQuestions();
	}
	
	@Post("/questions")
	public void add(Question question) {
		question.setUser_id_created(usuarioWeb.getId());
		dao.save(question);
		result.redirectTo(this).list();
	}
	
	//@Put("/questions/edit")
	public Question edit(Long id){
		Question question = dao.load(id);
		return question;
	}
	@Put("/questions/altera")
	public void altera(Question question){
		dao.update(question);
		result.redirectTo(this).list();
	}
	
	//@Delete("/questions/remove/{question.id}")
	public void remove(Long id){
		Question question = dao.load(id);
		dao.remove(question);
		result.redirectTo(this).list();
	}
}
