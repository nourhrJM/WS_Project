<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HelloWorld page</title>
</head>
<body>
    ${title}<br/><br/>
    Dear ${user}, you are successfully logged, welcome.
    <h2>
        <a href="signup">My profil</a>
        <a href="groupes/pageT">Create Group</a>
        <a href="groupes/pageTT">User's list</a>
        <a href="users/saveOrUpdate">Group Memebers</a>
        <a href="users/list">my groups</a>
        <a href="users/delete">Search group</a>
				</h2>
    <br/>
    <a href="<c:url value="/j_spring_security_logout" />">Logout</a>
</body>
</html>