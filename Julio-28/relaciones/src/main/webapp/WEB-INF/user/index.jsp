<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <h1>New User</h1>
                <form:form action="/user" method="post" modelAttribute="user">
                    <p>
                        <form:label path="username">Username</form:label>
                        <form:input path="username" />
                        <form:errors path="username" />
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
                <hr>
                <h1>User List</h1>
                <ul>
                    <c:forEach var="user" items="${users}">
                        <li>
                            <a href="/user/${user.getId()}">
                                <c:out value="${user.getUsername()}" />
                            </a>                            
                        </li>
                    </c:forEach>
                </ul>
            </body>

            </html>