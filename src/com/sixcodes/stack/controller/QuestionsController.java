package com.sixcodes.stack.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

import com.sixcodes.stack.dao.QuestionDAO;
import com.sixcodes.stack.model.Question;

@Resource
public class QuestionsController {
	
	private final QuestionDAO dao;
	private final Result result;
	
	public QuestionsController(QuestionDAO dao, Result result) {
		this.dao = dao;
		this.result = result;
		}

	@Path("/question/list")
	@Get
	public List<Question> list() {
		return dao.allQuestions();
	}
	
	@Path("/question/add")
	@Post
	public void add(Question question) {
		dao.save(question);
		// Mudar para url da pergunta de fato criada(ex: /question/1)
		result.redirectTo(this).list();
	}
	
	@Path("/question/edit")
	@Put
	public void edit(Long id){
		Question question = dao.load(id);
		dao.edit(question);
		result.redirectTo(this).list();
	}
	
	@Path("question/remove")
	@Delete
	public void remove(Long id){
		Question question = dao.load(id);
		dao.remove(question);
		result.redirectTo(this).list();
	}
}
