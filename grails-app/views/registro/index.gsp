<!doctype html>
<html>
<head>
    <title>Welcome to Grails</title>
    <meta name="layout" content="main"/>
</head>
<body>
  

  <g:form controller="registro" action="registrar">
    Usuario: <input type="text" name="usuario" />
    <br/>
    contraseña: <input type="password" name="pass" />
    <br/>
    Nombre y Apellido: <input type="text" name="nombreYapellido" />
    <br/>
    Email: <input type="email" name="correo" />
    <br/>
    <button type="submit">enviar</button>
  </g:form>
</body>
</html>