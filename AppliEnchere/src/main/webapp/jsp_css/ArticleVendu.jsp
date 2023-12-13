<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="ArticleVendu.css">
<link rel="stylesheet" href="Retrait.jsp">
<link rel="stylesheet" href="Utilisateur.jsp">
<link rel="stylesheet" href="Categorie.jsp">
</head>
<body>
<form action="index.php" method="post">
    <h2>Cr�er une nouvelle vente aux ench�res</h2>

    <div class="form-group">
        <label for="nomArticle">Nom de l'article</label>
        <input type="text" name="nomArticle" id="nomArticle" placeholder="Saisissez un nom pour l'article">
    </div>

    <div class="form-group">
        <label for="description">Description de l'article</label>
        <textarea name="description" id="description" rows="5" placeholder="D�crivez bri�vement l'article"></textarea>
    </div>

    <div class="form-group">
        <label for="dateDebutEncheres">Date de d�but des ench�res</label>
        <input type="date" name="dateDebutEncheres" id="dateDebutEncheres">
    </div>

    <div class="form-group">
        <label for="dateFinEncheres">Date de fin des ench�res</label>
        <input type="date" name="dateFinEncheres" id="dateFinEncheres">
    </div>

    <div class="form-group">
        <label for="miseAPrix">Mise � prix</label>
        <input type="number" name="miseAPrix" id="miseAPrix" placeholder="Saisissez la mise � prix">
    </div>

    <div class="form-group">
        <label for="prixVente">Prix de vente</label>
        <input type="number" name="prixVente" id="prixVente" placeholder="Saisissez le prix de vente">
    </div>

    <div class="form-group">
        <label for="etatVente">�tat de la vente</label>
        <select name="etatVente" id="etatVente">
            <option value="En cours">En cours</option>
            <option value="Termin�e">Termin�e</option>
            <option value="Annul�e">Annul�e</option>
        </select>
    </div>

    <input type="submit" value="Enregistrer la vente">
</form>

</body>
</html>