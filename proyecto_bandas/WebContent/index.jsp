<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function ponerValor(valorBoton) {
	var numero_uno = document.getElementById('numero_uno').value;
	var numero_dos = document.getElementById('numero_dos').value;
	var operacion = document.getElementById('operacion').value;
//(condicion)?si:sino
	if(operacion == "") {
		document.getElementById('numero_uno').value+=valorBoton;
	}
	else {
		document.getElementById('numero_dos').value+=valorBoton;
	}
}
 function ponerOperador(oper) {
	 document.getElementById('operacion').value=oper;
}

</script>

</head>
<body>
	<form action="CalculadoraServlet" method="POST">
		Primer Número: <input style="margin-left: 0.9% !important" type="text" id="numero_uno" name="numero_uno"><br>
		Operación: <input style="margin-left: 3.4% !important" type="text" id="operacion" name="operacion"><br>
		Segundo Número: <input style="margin-left: 0% !important" type="text" id="numero_dos" name="numero_dos"><br>
		<br><input type="submit" value="Calcular">
	</form><br>
	<div>
		<input type="button" value="+" onClick="ponerOperador('+')">
		<input type="button" value="-" onClick="ponerOperador('-')">
		<input type="button" value="*" onClick="ponerOperador('*')">
		<input type="button" value="/" onClick="ponerOperador('/')">
		<input type="button" value="Raíz" onClick="ponerOperador('r')">
	</div>
	<div><br>
		<input type="button" value="1" onClick="ponerValor('1')">
		<input type="button" value="2" onClick="ponerValor('2')">
		<input type="button" value="3" onClick="ponerValor('3')">
	</div>
	<div>
		<input type="button" value="4" onClick="ponerValor('4')">
		<input type="button" value="5" onClick="ponerValor('5')">
		<input type="button" value="6" onClick="ponerValor('6')">
	</div>
	<div>
		<input type="button" value="7" onClick="ponerValor('7')">
		<input type="button" value="8" onClick="ponerValor('8')">
		<input type="button" value="9" onClick="ponerValor('9')">
	</div>
	<div>
		<input style="margin-left: 2.03% !important" type="button" value="0" onClick="ponerValor('0')">
	</div>
</body>
</html>