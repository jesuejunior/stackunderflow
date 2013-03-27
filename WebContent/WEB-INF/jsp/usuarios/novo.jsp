<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/templates/base.jsp" />
<div class="container">
    <form id="userForm" class="form-horizontal" action="<c:url value="/usuarios"/>" method="POST">
        <fieldset>
            <legend>Cadastrar novo usuário.</legend>
            <div class="control-group">
                <label class="control-label" for="inputFirstName">Nome:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputFirstName" placeholder="Nome" name="usuario.firstname" value="${usuario.firstname}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLastName">Sobrenome:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputLastName" placeholder="Sobrenome" name="usuario.lastname" value="${usuario.lastname}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email:</label>
                <div class="controls">
                    <input class='controls' type="email" id="inputEmail" placeholder="Email" name="usuario.email" value="${usuario.email}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputUsername">Usuario:</label>
                <div class="controls">
                    <input class='controls' type="text" id="inputUsername" placeholder="Usuario" name="usuario.username" value="${usuario.username}">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password:</label>
                <div class="controls">
                    <input class="controls" type="password" id="inputPassword" placeholder="Password" name="usuario.password" value="${usuario.password}">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <input type="submit" class="btn" value="Cadastrar">
                </div>
            </div>
        </fieldset>
    </form>
 </div>
