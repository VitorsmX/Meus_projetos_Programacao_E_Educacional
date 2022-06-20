public class Conta{ 
    private String titular;
    private String telefone;
    private String agencia;
    private String conta;
    private float saldo;

    public Conta(String titularC, String telefoneC, String agenciaC, String contaC){
         titular = titularC;
         telefone = telefoneC;
         agencia = agenciaC;
         conta = contaC;
         saldo = 0;
    }

    public void depositar(float valor){
          if (valor >= 0) {
               saldo = saldo + valor;
               System.out.println("Depósito realizado com sucesso");
          }
          else System.out.println("Valor inválido");
    }

    public void sacar(float valor){
          if (valor >= 0){
               if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.println("Saque realizado com sucesso");

               }
               else System.out.println("Saldo insuficiente"); 

          }else System.out.println("Valor inválido");
    }

    public void exibirSaldo(){
        
          System.out.println("Saldo atual "+ saldo);    

    }

    public void setTitular(String titularc){
         titular = titularc;
    }

    public String getTitular(){
         return titular;
    }

    
}