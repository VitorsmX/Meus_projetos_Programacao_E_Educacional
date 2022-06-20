<?php
	include "conexao.php";

	$id = $_POST['id'];

	$SQL = "DELETE FROM camisas 
			WHERE id = $id";

	$db->query($SQL) or die("Query falhou");

	header("Location:pcadastrados.php");




?>