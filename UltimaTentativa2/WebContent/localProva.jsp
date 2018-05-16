<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="conteudo">
		<h3>Descobrir o local de prova</h3>
		<br>
		<form action="Palmeiras" method="post">
			<label>Insira seu nome completo: </label><br /> <input type="text"
				name="nome"><br /> <select name="curso">
				<option value="tecnicoInformatica">tecnico Informatica</option>
				<option value="tecnicoAlimentos">tecnico Alimentos</option>
				<option value="tecnicoAgropecuaria">tecnico Agropecuaria</option>
			</select> <input type="submit" value="Descobrir">
		</form>
	</div>
	Sua sala é ${resultado}
</body>
</html>