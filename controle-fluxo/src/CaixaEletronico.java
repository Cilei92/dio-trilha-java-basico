public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30.5;
        double valorSolicitado = 25;

        if (valorSolicitado < saldo){
         saldo = saldo - valorSolicitado;
         System.out.println("Novo Saldo: " + saldo);
        }else
         System.out.println("Saldo insuficiente");


         
    }
    
}