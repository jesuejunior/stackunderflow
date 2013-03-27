<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/templates/base.jsp" />
<div class="container">
	<div class="well">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Email</th>
					<th>Login</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${usuarioList}" var="usuario">
					<tr>
						<td>${usuario.firstname}</td>			
						<td>${usuario.email}</td>			
						<td>${usuario.username}</td>			
					</tr>
				</c:forEach>
			
			</tbody>
		</table>
	</div>
</div>