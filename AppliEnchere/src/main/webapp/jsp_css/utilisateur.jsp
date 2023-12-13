<%@ page language= "java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" 
	import="fr.eni.Appli.Enchere.bll.bo.Utilisateur"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un utilisateur</title>
<link rel="stylesheet" href="Utilisateur.css">

</head>
<body>



<form action="ajouterUtilisateur" method="post">
    <h2>Inscription</h2>

    <div class="form-group">
        <label for="utilisateur">Utilisateur</label>
        <input type="hidden" name="utilisateur" id="utilisateur" placeholder="Votre nom d'utilisateur" value="${utilisateur.noUtilisateur}">
    </div>

    <div class="form-group">
        <label for="pseudo">Pseudo</label>
        <input type="text" name="pseudo" id="pseudo" placeholder="Votre pseudo" value="${utilisateur.pseudo}">
    </div>

    <div class="form-group">
        <label for="nom">Nom</label>
        <input type="text" name="nom" id="nom" placeholder="Votre nom" value="${utilisateur.nom}">
    </div>

    <div class="form-group">
        <label for="prenom">Prénom</label>
        <input type="text" name="prenom" id="prenom" placeholder="Votre prénom" value="${utilisateur.prenom}">
    </div>

    <div class="form-group">
        <label for="email">Email</label>
        <input type="email" name="email" id="email" placeholder="Votre adresse email" value="${utilisateur.email}">
    </div>

    <div class="form-group">
        <label for="telephone">Téléphone</label>
        <input type="tel" name="telephone" id="telephone" placeholder="Votre numéro de téléphone" value="${utilisateur.telephone}">
    </div>

    <div class="form-group">
        <label for="rue">Rue</label>
        <input type="text" name="rue" id="rue" placeholder="Votre adresse" value="${utilisateur.rue}">
    </div>

    <div class="form-group">
        <label for="codePostal">Code postal</label>
        <input type="text" name="codePostal" id="codePostal" placeholder="Votre code postal" value="${utilisateur.codePostral}">
    </div>

    <div class="form-group">
        <label for="ville">Ville</label>
        <input type="text" name="ville" id="ville" placeholder="Votre ville" value="${utilisateur.ville}">
    </div>

    <div class="form-group">
        <label for="motDePasse">Mot de passe</label>
        <input type="password" name="motDePasse" id="motDePasse" placeholder="Votre mot de passe" value="${utilisateur.motDePasse}">
    </div>

    <input type="submit" value="Envoyer">
</form>



</body>
</html>