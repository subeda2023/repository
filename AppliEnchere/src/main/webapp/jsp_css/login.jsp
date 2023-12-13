<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List,fr.eni.Appli.Enchere.bll.bo.*"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion Jsp</title>
</head>
<body>
	<form method="post" action="login">
		<label for="email">Email :</label>
    	<input type="email" id="email" name="email" value="${cookie.lastLogin.value}" required> <br/>
	
		<label for="password">Mot de passe :</label>
    	<input type="password" id="password" name="password" required> <br/>
		<input type="submit" value="Se Connecter">
</form>
</body>
</html>




