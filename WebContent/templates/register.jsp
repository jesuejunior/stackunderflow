<!DOCTYPE html>
<html>
<head>
    <title>Cadastro</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="base.jsp" />
<div></div>
    <form class="form-horizontal" action="" method="post">
        <fieldset>
            <legend>Cadastro</legend>
            <div class="control-group">
                <label class="control-label" for="inputFirstName">Nome:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputFirstName" placeholder="Nome" name="entity.firstname" value="${entity.firstname}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLastName">Sobrenome:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputLastName" placeholder="Sobrenome" name="entity.lastname" value="${entity.lastname}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email:</label>
                <div class="controls">
                    <input class='controls' type="email" id="inputEmail" placeholder="Email" name="entity.email" value="${entity.email}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputUsername">Usuario:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputUsername" placeholder="Usuario" name="entity.username" value="${entity.username}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password:</label>
                <div class="controls">
                    <input class="controls" type="password" id="inputPassword" placeholder="Password" name="entity.password" value="${entity.password}">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <input type="submit" class="btn" value="Cadastrar">
                </div>
            </div>
        </fieldset>
    </form>
</body>
</html>
