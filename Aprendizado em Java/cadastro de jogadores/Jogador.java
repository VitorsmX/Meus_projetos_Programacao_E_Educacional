public class Jogador{
    private String apelido;
    private int idade;

    public Jogador(String apelidoJogador){
         apelido = apelidoJogador;
    }

    public void setApelido(String apelidoJogador){
         apelido = apelidoJogador;
    }

    public String getApelido(){
         return apelido;
    }

    public void setIdade(int idadeJogador){
         idade = idadeJogador;
    }

    public int getIdade(){
         return idade;
    }

}



/*
Em java, um objeto é definido como a instância de uma determinada classe. 
Para fazer uso de um objeto, é necessário, primeiramente, instanciá-lo com o comando new antes de 
invocá-lo e usar os métodos da classe a que ele pertence. 
Considere que uma empresa que desenvolve jogos contratou você e deseja construir um jogo com os 
seguintes requisitos:

1) Ter uma classe Jogador com os dados apelido e idade
2) Ter uma classe JogoApp que vai instanciar Jogadores

Diante dos requisitos acima, faça:

a) Crie a classe Jogador com os métodos getters e setters e um método construtor que recebe o apelido 
como parâmetro;

b) Crie a classe JogadorApp para utilizar a classe Jogador instanciando um objeto.

c) Alterar o apelido do jogador criado

d) Exibir na tela o apelido e a idade do jogador.
*/