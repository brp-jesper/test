<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
    </head>
    <body>
        <div id="header"><g:render template="/incl/header"/></div>
        <div id="body"><g:layoutBody /></div>
        <div id="footer"><g:render template="/incl/footer"/></div>
    </body>
</html>