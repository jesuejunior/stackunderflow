
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/templates/base.jsp" />

<div class="container">
		<div class="well">
		    <form class="form-horizontal" action="<c:url value="/questions"/>" method="POST">
		        <fieldset>
		            <legend>Pergunte</legend>
		            <div class="control-group">
		                <label class='control-label' for="inputTitle">Titulo</label>
		                <div class="controls">
		                    <input class='span6' type="text" id="titulo" name="question.titulo" placeholder="Qual a sua duvida?">
		                </div>
		            </div>
		            <div class="control-group">
		                <label class='control-label' for="descricao">Descrição</label>
		                <div class="controls">
		                    <textarea class='span6' id="descricao" name="question.tx_question" rows=5></textarea>
		                </div>
		            </div>
		            <div class="control-group">
		                <label class="control-label" for="inputTag">Tag</label>
		                <div class="controls">
		                    <input class='span6' type="text" id="tags" name="question.tags" placeholder="Pelo menos uma Tag">
		                </div>
		            </div>
		            <div class="control-group">
		                <div class="controls">
		                    <input type="submit" class="btn btn-success">
		                </div>
		            </div>
		        </fieldset>
		    </form>
		</div>
</div>