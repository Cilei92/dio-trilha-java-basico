import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 237.48;
        String agencia = "067-8";

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome completo: ");
        String nomeCliente = scanner.nextLine();        

        System.out.println("Digite o número  da Agência");
        String usuario = scanner.next();     
        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + usuario + " o seu saldo atual é R$ "+ saldo + " já está disponível para saque.");
        scanner.close();
    }
}