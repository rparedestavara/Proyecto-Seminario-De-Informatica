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
    
      <g:form controller="registro" action="registrar_producto">
     Codigo: <input type="text" name="producto" />
    <br/>
   
    Producto: <input type="text" name="producto" />
    <br/>
    Tipo: <input type="text" name="nuevoousado" />
    <br/>
    Precio: <input type="text" name="precio" />
    <br/>
    <button type="submit">enviar</button>
  </g:form>
</body>
</html>