<?php
	include "conexao.php";

	$id = $_GET['id'];

	$SQL = "SELECT nome FROM camisas WHERE id=$id";

	$camisas = $db->query($SQL) or die("Erro na busca do produto");

	if ($camisas->num_rows > 0){

			$dados = $camisas->fetch_assoc();

			$nome = $dados['nome'];

	}
	else die("produto não encontrado")




?>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Cadastrar Produto</title>
	<link rel="stylesheet" type="text/css" href="excluir_cadastro.css">
</head>
<body>
<div class="cadastro">
	<form action="excluir.php" method="post">

		<input type="hidden" name="id" value="<?php echo $id; ?>">
		
		<label>Deseja mesmo excluir o produto <?php echo $nome;?>?</label><br>

		<br><br>

		<input type="submit" value="Sim">
		<input type="button" onclick="history.go(-1)" value="Não">
	</form>

</div>
<div>
	<ul>
		<li><a href ="home.html"> Home</a></li>
		<li><a href="produtos.html">Produtos</a></li>
		<li><a href="faleConosco.html">Fale Conosco</a></li>
		<li><a href="empresa.html">Sobre a Empresa</a></li>
		<li><a href="cadastrar.html">Cadastrar Produtos</a></li>
		<li><a class="active" href="pcadastrados.php">Produto Cadastrados</a></li>
	</ul>
</div>
</body>
</html>