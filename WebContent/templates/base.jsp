<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath}/static/common/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="${pageContext.request.contextPath}/static/common/css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
</head>


<div  class="text-center" id="header">
	<div id="usuario">
	<c:if test="${usuarioWeb.logado}">
            Olá, ${usuarioWeb.nome }!
            <a href="<c:url value="/logout"/>">Logout</a>
        </c:if>
        <c:if test="${empty usuarioWeb or not usuarioWeb.logado}">
        Você não está logado
		<a href="<c:url value="/login"/>" class="btn btn-primary">Login</a>
		<a href="<c:url value="/usuarios/novo"/>">Cadastre-se</a>
		</c:if>
	</div>
</div>
<div class="">
 		<div class="navbar-inner">
	    <a style="margin-right: 5px"  href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/static/common/img/stackunderflow.PNG"></a>
	      <a href="<c:url value="/questions/list"/>" class="btn">Perguntas</a>
	      <a href="<c:url value="/usuarios/list"/>" class="btn">Usuários</a>
	      <a style="align: left" href="<c:url value="/questions/nova"/>" class="btn btn-danger">Perguntar</a>
	  </div>
</div>
<div style="margin: 15px"></div>
    
<div>
	<ul>
	<c:forEach items="${errors}" var="error">
		<li>${error.message}</li>
	</c:forEach>
	</ul>
</div>