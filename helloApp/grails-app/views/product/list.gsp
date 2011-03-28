<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Produktlista</title></head>
  <body>
      <ul>
        <g:each var="p" in="${products}">
          <li><g:link action="show" id="${p.id}"><brp:toUpper>${p.namn}</brp:toUpper></g:link></li>
        </g:each>
      </ul>

      <brp:note style="balloon">
        Hejsan
        Hopp!
      </brp:note>

  </body>
</html>