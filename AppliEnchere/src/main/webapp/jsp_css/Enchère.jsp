<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enchère</title>
<link rel="stylesheet" href="ArticleVendu.jsp">
<link rel="stylesheet" href="Utilisateur.jsp">
</head>
<body>
<form action="index.php" method="post">
    <h2>Enchere</h2>

    <div class="form-group">
        <label for="dateEnchère">Date de l'enchere</label>
        <input type="date" name="dateEnchère" id="dateEnchère">
    </div>

    <div class="form-group">
        <label for="montant_enchere">Montant de l'enchere</label>
        <input type="number" name="montant_enchere" id="montant_enchere" placeholder="Saisissez le montant de l'enchere">
    </div>

    <input type="submit" value="Envoyer">
</form>

</body>
</html>