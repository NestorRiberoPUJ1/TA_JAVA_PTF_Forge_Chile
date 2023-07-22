<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>Formulario de Registro</h1>
            <form action="/formulario" method="post">
                <div>
                    <label for="emailInput">Email</label>
                    <input type="text" name="email_input" id="emailInput">
                </div>
                <div>
                    <label for="passwordInput">Password</label>
                    <input type="password" name="password_input" id="passwordInput">
                </div>
                <div>
                    <label for="confirmInput">Confirm Password</label>
                    <input type="password" name="confirm_input" id="confirmInput">
                    <p>
                        <c:out value="${confirm}"></c:out>
                    </p>
                </div>
                <div>
                    <button type="submit">Registrar</button>
                </div>
            </form>
            <h3>
                <c:out value="${created}"></c:out>
            </h3>
            <hr>

            <c:if test="${usuarios!=[]}">
                <ul>
                    <c:forEach var="usuario" items="${usuarios}">
                        <li>
                            <a href="/usuario/${usuario.getId()}"><c:out value="${usuario.getEmail()}" /></a>
                            
                        </li>
                    </c:forEach>
                </ul>
            </c:if>

        </body>

        </html>