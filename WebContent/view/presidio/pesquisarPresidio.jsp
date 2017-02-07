<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<%@ page import="java.util.List"%>
<%@ page import="model.PresidioDao"%>
<%@ page import="model.Presidio"%>
    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listando Presídios</title>
</head>
<body>


	<table border='1' style='width: 100%;'>
	
		<tr style='background-color: #E6E6E6; font-weight: bold;'>
		
			<td>ID</td>
			
			<td>NOME DO PRESÍDIO</td> 
			
			<td>ESTADO</td> 
			
			<td>CIDADE</td> 
			
			<td>TIPO DO PRESÍDIO</td> 
			
			
			
			  
			
			<c:forEach var="presidio" items="${listaPresidio}">
				<tr>
					<td>${presidio.idPresidio}</td>
					<td>${presidio.nome}</td> 
					<td>${presidio.estado}</td>
					<td>${presidio.cidade}</td>
					<td>${presidio.tipo}</td>
				
					
					
					
			</c:forEach>
	</table>
	<br><br>
	
	<!-- <a href="incluirPresidio.jsp">Voltar a incluir Presídio</a> -->
	

</body>
</html>