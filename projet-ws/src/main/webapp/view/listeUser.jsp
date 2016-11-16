<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Liste</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>email</th>
                    <th>first name</th>
                    <th>biography</th>
                    <th>groups</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${ListeUser}" var="user">
                    <tr>
                        <td><c:out value="${user.email_address}"/></td>
                        <td><c:out value="${user.first_name}"/></td>
                        <td><c:out value="${user.biography}"/></td>
                         <td><c:out value="${user.groups}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>