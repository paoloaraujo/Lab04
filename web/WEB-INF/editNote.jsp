<%-- 
    Document   : editnote
    Created on : Jun 4, 2022, 11:20:21 AM
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
        <h1>Edit Note</h1>
        <form method="POST" action="note">
            
        <p>Title: </p> 
            <input type="text" name="title" value="${note.title}">
            <br>
        <p>Content: </p>
        <textarea name="content"> ${note.content}></textarea>
            <br>
            <input type="submit" value="Save">
            
        
        </form>
    </body>
</html>
