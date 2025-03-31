import java.util.Scanner;

public class ContaTerminalScanner {
    public static void main(String[] args) {
        // Criando um Scanner para capturar entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados ao usuário
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo os dados formatados
        System.out.println("\n=== DADOS DA CONTA ===");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.printf("Saldo: R$ %.2f\n", saldo);

        // Mensagem personalizada
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\n" +
                          "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                          nomeCliente, agencia, numero, saldo);

        // Fechando o Scanner
        scanner.close();
    }
}
