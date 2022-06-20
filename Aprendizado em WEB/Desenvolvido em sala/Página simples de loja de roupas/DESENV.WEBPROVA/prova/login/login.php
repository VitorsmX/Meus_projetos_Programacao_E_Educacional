</<?php 
include('conexao.php');

if(empty($_POST['usuario']) || empty($_POST['senha'])) {
	header('Location:prova/login.html');
	exit();
}

$usuario = mysql_real_escape_string($db, $_POST['usuario']);
$senha = mysql_real_escape_string($db, $_POST['senha']);

$query= "select id_usuario, usuario from usuario where usuario = '{$usuario}' and senha = md5('{$senha}')";

$result = mysql_num_rows($result);

if($row == 1) {
	$_SESSION['usuario'] = $usuario;
	header('Location: prova/painel.php');
	exit();
} else {
	header('Locatio:prova/login.html');
	exit();
}
?>