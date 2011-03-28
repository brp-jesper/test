<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Produktinfo</title></head>
  <body>
    Id: ${product.id}<br/>
    Namn: ${product.namn}<br/>
    Datum: <g:formatDate date="${product.datum}" format="yyyy-MM-dd"/> <br/>
    Pris: <g:formatNumber number="${product.pris}" type="currency" currencyCode="SEK"/> <br/>
    <hr/>
    <a href="<g:createLink action="list"/>">Till lista</a>
  </body>
</html>