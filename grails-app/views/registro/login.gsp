<!doctype html>
<html>
<head>
    <title>Welcome to Grails</title>
    <meta name="layout" content="main"/>
</head>
<body>

	<g:if test="${params.us}">
		println params.us
		<p>Felicidades ya estas registrado podes loguearte "${params}"</p>
	</g:if>
  	esta es mi página
    hola "${us}"
  	<g:form controller="prueba" action="index3">
    	usuario: <input type="text" name="unuario" />
    	<br/>
    	Contraseña: <input type="password" nome="pass"/>
    	<br/>
         <button type="submit">enviar</button>
       <br/>
    </g:form> 	
    <g:link>
    	<button controller="registro" action="index" type="button">Si no estas registrado podes registrarte haciendo click</button>
		<br/>
	</g:link>
	<g:hasErrors bean="${us}">
  		<ul>
   			<g:eachError var="err" bean="${us}">
       			<li>${err}</li>
   			</g:eachError>
  		</ul>
	</g:hasErrors>
</body>
</html>