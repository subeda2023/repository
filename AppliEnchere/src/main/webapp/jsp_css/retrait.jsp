<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="index.php" method="post">
    <h2>Adresse</h2>

    <div class="form-group">
        <label for="rue">Rue</label>
        <input type="text" name="rue" id="rue" placeholder="Saisissez la rue">
    </div>

    <div class="form-group">
        <label for="code_postal">Code postal</label>
        <input type="text" name="code_postal" id="code_postal" placeholder="Saisissez le code postal">
    </div>

    <div class="form-group">
        <label for="ville">Ville</label>
        <input type="text" name="ville" id="ville" placeholder="Saisissez la ville">
    </div>

    <input type="submit" value="Envoyer">
</form>

</body>
</html>