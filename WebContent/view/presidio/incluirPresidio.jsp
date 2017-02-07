<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir Presidio</title>
</head>
<body>

	<hr>
	<h3>Incluir Presidio</h3>
	<hr>
	<form action="incluirPresidio" method="post">
		<p>
			Nome do Presídio: <br /> <input type="text" name="nome" maxlength="120" />
		</p>
		<p>
			Estado: <br /> <input type="text" name="estado" maxlength="120" />
		</p>


		<p>
			Cidade: <br /> <input type="text" name="cidade" maxlength="120" />
		</p>

		<p>
			Tipo de Presídio: <br /> <input type="text" name="tipo" maxlength="120" />
		</p>


		

		<p>
			<input type="submit" value="Incluir">
		</p>
	</form>
	<br><br>
	<!-- <a href="view/presidio/pesquisarPresidio.jsp">Listar Presídios</a> -->
	

</body>
</html>