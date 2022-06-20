<?php

	include "conexao.php";

	$id        = $_POST['id'];
	$nome      = $_POST['nome'];
	$cor       = $_POST['cor'];
	$categoria = $_POST['categoria'];
	$valor     = $_POST['valor'];

	$SQL = "UPDATE camisas SET nome='$nome',cor='$cor',categoria='$categoria',valor='$valor'
			WHERE id = $id";

	$db->query($SQL)or die("Query falhou");
		header("Location:pcadastrados.php");

?>