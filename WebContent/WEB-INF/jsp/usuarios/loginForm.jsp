<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:import url="/templates/base.jsp" />
<div class="container">
		<div class="well">
		  <form class="form-horizontal" action="<c:url value="/login"/>" method="POST">
		     
		         <legend>Efetue o Login</legend>
		         <div class="control-group">
		             <label class="control-label" for="username">Usuário</label>
		             <div class="controls">
		             	<input type="text" id="username" name="usuario.username" placeholder="Usuario">
		             </div>
		         </div>
		         <div class="control-group">
		             <label class="control-label" for="password">Senha</label>
			         <div class="controls">
			         	<input type="password" id="password" name="usuario.password" placeholder="Senha">
			         </div>    
		         </div>
		         
		         <div class="control-group">
		             <div class="controls">
		                 <button type="submit" class="btn">Sign in</button>
		             </div>
		         </div>
		 </form>
	 </div>
 </div>