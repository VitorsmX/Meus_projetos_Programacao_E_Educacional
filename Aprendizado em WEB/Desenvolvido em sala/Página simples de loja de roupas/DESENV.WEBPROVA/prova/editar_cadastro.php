<?php
	include "conexao.php";

	$id = $_GET['id'];

	$SQL = "SELECT * FROM camisas WHERE id=$id";

	$camisas = $db->query($SQL) or die("Erro na busca do produto");

	if ($camisas->num_rows > 0){

			$dados = $camisas->fetch_assoc();

			$nome = $dados['nome'];
			$cor = $dados['cor'];
			$categoria = $dados['categoria'];
			$valor = $dados['valor'];
			$nome = $dados['nome'];

	}
	else die("produto não encontrado")




?>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Cadastrar Produto</title>
	<link rel="stylesheet" type="text/css" href="editar_cadastro.css">
</head>
<body>
<div class="cadastro">
	<h1>Editar Cadastro</h1><br>
	<form action="salvar_cadastro.php" method="post">
		<input type="hidden" name="id" value="<?php echo $id ?>">
		<p>Nome da Estampas
		<input type="text" name="nome" id="nome" value="<?php echo $nome ?>"><br><br>
		<p>Cores Disponível</p>
		<input type="text" name="cor" id="cor"  value="<?php echo $cor ?>"><br><br>
		<p>Categoria</p>
			<select name="categoria" id="categoria">
				<option value="">selecione</option>
				<option value="M" <?php if ($categoria == "M") echo "selected='selected'"; ?>>Masculino</option>
				<option value="F" <?php if ($categoria == "F") echo "selected='selected'"; ?>>Feminino</option>
				<option value="I" <?php if ($categoria == "I") echo "selected='selected'"; ?>>Infantil</option>
			</select><br><br>
		<p>Valor</p>
		<input type="text" name="valor" id="valor" value="<?php echo $valor ?>"><br><br>
		<input type="submit" value="Alterar">
	</form>

</div>
<div>
	<ul>
		<li><a href ="home.html"> Home</a></li>
		<li><a href="produtos.html">Produtos</a></li>
		<li><a href="faleConosco.html">Fale Conosco</a></li>
		<li><a href="empresa.html">Sobre a Empresa</a></li>
		<li><a href="cadastrar.html">Cadastrar Produto</a></li>
		<li><a class="active" href="pcadastrados.php">Produto Cadastrados</a></li>
	</ul>
</div>
</body>
</html>