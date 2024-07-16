import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To DO: conhecer e importar classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Agora digite à agência: ");
        String agencia = scanner.next();

        System.out.println("Agora insira o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Agora insira o sobrenome do cliente: ");
        String sobrenome = scanner.next();

        System.out.println("Por último insira o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "+ nome + " " +sobrenome);
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é: "+agencia +", conta: " + numero + " e seu saldo é: " +saldo  );

        // Exibir as mensagens para o nosso usuario

        // obter pela scanner os valores digitados no terminal

        // Exibir a mensagem de conta criada
    }
}
