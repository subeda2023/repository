<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@import="fr.eni.Appli.Enchere.bll.bo.Utilisateur" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification de l'utilisateur</title>
</head>
<body>
	<h1>Modification d'un utilisateur</h1>
	
	<form method="post" action="modifierUtilisateur">
		<input type="hidden" name="no_utilisateur" value="${utilisateur.noUtilisateur}">
		<label name="pseudo">Pseudo :</label>
		<input type="text" name="pseudo" value="${utilisateur.pseudo}"><br/>
		
		<label name="nom">Nom :</label>
		<input type="text" name="nom" value="${utilisateur.nom}"><br/>
		
		<label name="prenom">Prénom :</label>
		<input type="text" name="prenom" value="${utilisateur.prenom}"><br/>
		
		<label name="email">Email :</label>
		<input type="email" name="email" value="${utilisateur.email}"><br/>
		
		<label name="telephone">Numéro de téléphone :</label>
		<input type="text" name="telephone" value="${utilisateur.telephone}"><br/>
		
		<label name="rue">Numéro et rue :</label>
		<input type="text" name="rue" value="${utilisateur.rue}"><br/>
		
		<label name="codePostal">Code postal :</label>
		<input type="text" name="codePostal" value="${utilisateur.codePostal}"><br/>
		
		<label name="ville">Ville :</label>
		<input type="text" name="ville" value="${utilisateur.ville}"><br/>
		
		<label name="motDePasse">Mot de passe :</label>
		<input type="password" name="motDePasse" value="${utilisateur.motDePasse}"><br/>
		
		<input type="submit" value="valider">
	</form>
</body>
</html>