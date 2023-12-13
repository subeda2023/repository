<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ import="java.util.List"%>
<%@	import ="fr.eni.Appli.Enchere.bll.bo.*"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des utilisateurs</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>pseudo</th>
				<th>nom</th>
				<th>prenom</th>
				<th>email</th>
				<th>telephone</th>
				<th>rue</th>
				<th>codePostal</th>
				<th>ville</th>
				<th>motDePasse</th>
				<th>credit</th>
				<th>administrateur</th>
			</tr>
		<thead>
		<tbody>
			<c:forEach var="utilisateur" items="${liste}">
                <tr>
                    <td>${utilisateur.pseudo}</td>
                    <td>${utilisateur.nom}</td>
                    <td>${utilisateur.prenom}</td>
                    <td>${utilisateur.email}</td>
                    <td>${utilisateur.telephone}</td>
                    <td>${utilisateur.rue}</td>
                    <td>${utilisateur.codePostal}</td>
                    <td>${utilisateur.ville}</td>
                    <td>${utilisateur.motDePasse}</td>
                    <td>${utilisateur.credit}</td>
                    <td>${utilisateur.administrateur}</td>                    
                </tr>
            </c:forEach>
		
		</tbody>
	</table>

</body>
</html>