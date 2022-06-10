<%-- 
    Document   : viewnote
    Created on : Jun 4, 2022, 11:19:48 AM
    Author     : Paolo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${note.title}</p>
        <p>Contents:
            <br>
            ${note.content}
        </p>
        <a href="note?edit">Edit</a>
    </body>
</html>
