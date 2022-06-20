<?php

	include "conexao.php";

	$nome      = $_POST['nome'];
	$cor       = $_POST['cor'];
	$categoria = $_POST['categoria'];
	$valor     = $_POST['valor'];

	$SQL = "INSERT INTO camisas(nome, cor, categoria, valor)
			VALUES ('$nome', '$cor', '$categoria', '$valor')";


	$db->query($SQL)or die("Query falhou");
		header("Location:pcadastrados.php")

?>


<!DOCTYPE html>
<html lang="ptbr">
<head>
	<meta charset="utf-8">
	<title></title>
</head>
<body>

	<?php

		//echo "Dados inseridoas com sucesso, id cliente:".$db->insert_id;
		//echo "Nome: $nome <br>";
		//echo "Telefone: $fone <br>";
		//echo "Sexo: $sexo <br>";
	?>


</body>
</html>