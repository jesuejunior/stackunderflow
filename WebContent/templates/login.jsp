<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="base.jsp" />
<div>
    <form class="form-horizontal" action="" method="post">
        <fieldset>
            <legend>Login</legend>
            <div class="control-group">
                <label class="control-label" for="inputUser">Usuario</label>
                <input class='controls' type="text" id="inputUser" placeholder="Usuario">
                <div class="controls">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Senha</label>
                <input class='controls' type="password" id="inputPassword" placeholder="Senha">
            </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn">Sign in</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>
</html>