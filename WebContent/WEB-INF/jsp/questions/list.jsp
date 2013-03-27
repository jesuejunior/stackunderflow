<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/templates/base.jsp" />
<div class="container">
	<div class="well">
		<table class="table table-hover">
			<tbody>
				<c:forEach items="${questionList}" var="question">
					<tr>
						<td>${question.titulo}</td>			
						<td>${question.user_id_created}</td>			
						<td>${question.dt_created}</td>
						<td>
						<a class="icon-tasks"  href="edit?id=${question.id}"> </a>
						</td>
						
						<td>
						<a class="icon-remove" href="remove?id=${question.id}"> </a>
						</td>
									
					</tr>
				</c:forEach>
			
			</tbody>
		</table>
	</div>
</div>