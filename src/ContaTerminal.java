public class ContaTerminal {
    
    public static void main(String[] args) {
        // Verifica se todos os argumentos foram fornecidos
        if (args.length < 4) {
            System.out.println("Erro: Argumentos insuficientes!");
            System.out.println("Uso correto: java ContaTerminal <numero> <agencia> <nomeCliente> <saldo>");
            System.out.println("Exemplo: java ContaTerminal 1234 567-8 \"Fulano da Silva\" 1500.75");
            return;
        }

        try {
            // Conversão dos argumentos
            int numero = Integer.parseInt(args[0]);
            String agencia = args[1]; // Mantido como String pois pode conter hífen (ex: 067-8)
            String nomeCliente = args[2];
            double saldo = Double.parseDouble(args[3]);

            // Exibição correta das informações
            System.out.println("\n=== DADOS DA CONTA ===");
            System.out.println("Número da conta: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Nome do cliente: " + nomeCliente);
            System.out.printf("Saldo: R$ %.2f\n", saldo);
            
            // Mensagem de boas-vindas formatada
            System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\n" +
                            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                    nomeCliente, agencia, numero, saldo);
                    
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato inválido para número ou saldo!");
            System.out.println("Certifique-se que o número é inteiro e o saldo é numérico (ex: 1500.75)");
        }
    }
}