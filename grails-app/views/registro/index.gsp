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
        <g:hasErrors bean="${us}">
        <ul>
            <g:eachError var="err" bean="${us}">
                <li>${err}</li>
            </g:eachError>
        </ul>
    </g:hasErrors>
  </g:form>
</body>
</html>