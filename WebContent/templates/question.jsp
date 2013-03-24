<!DOCTYPE html>
<html>
<head>
    <title>Pergunte</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="base.jsp" />
<div>
    <form class="form-horizontal" action="" method="post">
        <fieldset>
            <legend>Pergunte</legend>
            <div class="control-group">
                <label class='control-label' for="inputTitle">Titulo</label>
                <div class="controls">
                    <input  class='span6'type="text" id="inputTitle" placeholder="Qual a sua duvida?">
                </div>
            </div>
            <div class="control-group">
                <label class='control-label'></label>
                <div class="controls">
                    <textarea class='span6' id="textExplain" rows=5></textarea>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputTag">Tag</label>
                <div class="controls">
                    <input class='span6' type="text" id="inputTag" placeholder="Pelo menos uma Tag">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <input type="submit" class="btn">
                </div>
            </div>
        </fieldset>
    </form>
</div>
</html>