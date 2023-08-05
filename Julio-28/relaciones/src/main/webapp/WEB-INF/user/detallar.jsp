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
                <a href="/user">volver</a>
                <h1>
                    <c:out value="${active_user.getUsername()}" />
                </h1>
                <h2>Seguidos</h2>
                <form:form action="/user/seguir" method="post" modelAttribute="user">
                    <form:hidden path="id" />
                    <input name="id" type="hidden" value="${active_user.getId()}"/>
                    <p>
                        <form:select path="seguidos" >
                            <form:options items="${users}" itemLabel="username" />
                        </form:select>
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
                <c:choose>
                    <c:when test="${active_user.getSeguidos().size() == 0}">
                        No sigues a nadie
                    </c:when>
                    <c:otherwise>
                        <ul>
                            <c:forEach var="seguidos" items="${active_user.getSeguidos()}">
                                <li>
                                    <a href="/user/${seguidos.getId()}">
                                        <c:out value="${seguidos.getUsername()}" />
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </c:otherwise>

                </c:choose>



            </body>

            </html>