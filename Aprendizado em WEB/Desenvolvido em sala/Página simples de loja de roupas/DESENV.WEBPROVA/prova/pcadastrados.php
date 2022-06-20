<?php
	include "conexao.php";

	$SQL = "SELECT * FROM camisas ORDER BY categoria";

	$camisas = $db->query($SQL) or die("Erro na busca do produto");

?>

<!DOCTYPE html>
<html lang="ptbr">
<head>
	<meta charset="utf-8">
	<title>produtoscadastrados</title>
	<link rel="stylesheet" type="text/css" href="pcadastrados.css">
</head>
<body>
	<div>
		<ul>
			<li><a href ="home.html"> Home</a></li>
			<li><a href="produtos.html">Produtos</a></li>
			<li><a href="faleConosco.html">Fale Conosco</a></li>
			<li><a href="empresa.html">Sobre a Empresa</a></li>
			<li><a href="cadastrar.html">Cadastrar Produtos</a></li>
			<li><a class="active" href="pcadastrados.php">Produtos Cadastrados</a></li>
		</ul>
	</div>
	<?php
		if($camisas->num_rows == 0) echo "<p>Não foram encontrado produdos</p>";
		else{
	?>
	<h1>Produtos Cadastrados</h1>
	<div style="overflow-x:auto;">
		<table class="tabela">
			<thead>
				<th>Código</th>
				<th width="200">Estampa</th>
				<th width="200">Cor</th>
				<th>Categoria</th>
				<th width="70">Valor</th>
				<th width="60"></th>
				
			</thead>
			<tbody>
			<?php
				while ($dados = $camisas->fetch_assoc()) {

			?>
				<tr>
					<td><?php echo $dados['id'];?></td>
					<td><?php echo $dados['nome'];?></td>
					<td><?php echo $dados['cor'];?></td>
					<td><?php echo $dados['categoria'];?></td>
					<td><?php echo $dados['valor'];?></td>
				<td>
					<a href="editar_cadastro.php?id=<?php echo $dados['id'];?>"><img  src="icones/edita.png" width="25"></a>
					<a href="excluir_cadastro.php?id=<?php echo $dados['id'];?>"><img src="icones/lixeira.png" width="25"></a>
				</td>
				</tr>
			<?php
				}
			?>
			</tbody>
		</table>
	<?php
		}
	?>
</div>
</body>
</html>