<%--
  Created by IntelliJ IDEA.
  User: foufa
  Date: 17/05/2023
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Users" method = "post" name="Usersform">
    <label class ="form-label" for="nom">Nom:</label>
    <input class="form-control" name="nom" id="nom" type="text" placeholder="Donner votre nom" required />

    <label class ="form-label" for="prenom">Prenom:</label>
    <input class="form-control" name="prenom" id="prenom" type="text" placeholder="Donner votre prenom" required />

    <label class ="form-label" for="age">age:</label>
    <input class="form-control" name="age" id="age" type="text" placeholder="Donner votre age" required />


    <label class ="form-label" for="email">Nom:</label>
    <input class="form-control" name="email" id="email" type="email" placeholder="Donner votre addresse mail" required />

    <label class ="form-label" for="motDePasse">motDePasse:</label>
    <input class="form-control" name="motDePasse" id="motDePasse" type="Password" placeholder="Donner votre mot de passe" required />

    <br>

    <button class="btn btn-primary" type="submit" name="save">Add</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Nom</th>
        <th scope="col">prenom</th>
        <th scope="col">Age</th>
        <th scope="col">Email</th>
        <th scope="col">Mot de passe</th>

    </tr> </thead>
    <tbody>
    <c:forEach items="${ Users }" var="s">
        <tr>
            <th scope="row"><c:out value="${s.id}"/> </th>
            <td><c:out value="${s.nom}"/></td>
            <td><c:out value="${s.prenom}"/></td>
            <td><c:out value="${s.age}"/></td>
            <td><c:out value="${s.email}"/></td>
            <td><c:out value="${s.motDepasse}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
