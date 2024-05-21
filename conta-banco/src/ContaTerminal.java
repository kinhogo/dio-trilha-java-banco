import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        //Criação do Scanner para ler as entradas do Usuario
        Scanner scanner = new Scanner(System.in);

        //Declarando as variaveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Solicitando informações ao usuario
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu Saldo!");
        saldo = scanner.nextDouble();

        //Exibindo a mensagem final com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        //Fechar o scanner
        scanner.close();


    }
}