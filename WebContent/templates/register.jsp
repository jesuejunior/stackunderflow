<!DOCTYPE html>
<html>
<head>
    <title>Cadastro</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="base.jsp" />
<body>

    <form class="form-horizontal" action="" method="post">
        <fieldset>
            <legend>Cadastro</legend>
            <div class="control-group">
                <label class="control-label" for="inputFirstName">Nome:</label>
                <div class="controls">
                    <input type="text" id="inputFirstName" placeholder="Nome">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLastName">Sobrenome:</label>
                <div class="controls">
                    <input type="text" id="inputLastName" placeholder="Sobrenome">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email:</label>
                <div class="controls">
                    <input type="text" id="inputEmail" placeholder="Email">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputUsername">Usuário:</label>
                <div class="controls">
                    <input type="text" id="inputUsername" placeholder="Usuário">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password:</label>
                <div class="controls">
                    <input type="password" id="inputPassword" placeholder="Password">
                </div>
                <div class="controls">
                    <input type="submit" class="btn" value="Cadastrar">
                </div>
            </div>
        </fieldset>
    </form>
</body>
</html>
