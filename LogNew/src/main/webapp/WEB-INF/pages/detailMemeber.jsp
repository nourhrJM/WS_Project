<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
 font-size: 20px;
 color: teal;
 font-family: Calibri;
}

td {
 font-size: 15px;
 color: black;
 width: 100px;
 height: 22px;
 text-align: left;
}

.heading {
 font-size: 18px;
 color: white;
 font: bold;
 background-color: orange;
 border: thick;
}
</style>
<body>
<%@ include file="MenuGroupes.jsp" %>
<table  class="table table-striped">
                      <thead>
                        <tr>
                         
                          <th>Name group</th>
                          
                          <th>Name mumber</th>
						  <th> Role</th>
                        </tr>
                      </thead>
                      <tbody >
                        <c:forEach items="${memeber}" var="memeber">
                    <tr>
                       <td><c:out value="${memeber.nameGroup}"/></td>
                       
                        <td><c:out value="${memeber.nameMember}"/></td>
                       
                        <td>
                          <c:out value="${memeber.role}"/>
                        </td>

                    </tr>
                </c:forEach>
                      </tbody>
                    </table>




</body>
</html>