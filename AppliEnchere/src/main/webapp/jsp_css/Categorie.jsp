<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="ArticleVendu.jsp">
</head>
<body>
<form action="index.php" method="post">
    <h2>Cr�er une nouvelle cat�gorie</h2>

    <div class="form-group">
        <label for="noCategorie">Num�ro de la cat�gorie</label>
        <input type="number" name="noCategorie" id="noCategorie" placeholder="Saisissez le num�ro de la cat�gorie">
    </div>

    <div class="form-group">
        <label for="libelle">Libell� de la cat�gorie</label>
        <input type="text" name="libelle" id="libelle" placeholder="Saisissez le libell� de la cat�gorie">
    </div>

    <input type="submit" value="Enregistrer">
</form>

</body>
</html>