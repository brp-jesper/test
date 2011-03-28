<%--
  Created by IntelliJ IDEA.
  User: Jesper
  Date: 2011-03-23
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Personer</title></head>
  <body>
  <g:render template="pageheader" />
  <ul>
    <g:render template="person" collection="${people}"/>
  </ul>

  <export:formats formats="['csv', 'excel', 'ods', 'pdf', 'rtf', 'xml']" />


  </body>
</html>