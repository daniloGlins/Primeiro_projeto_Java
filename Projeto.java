import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: Danilo Gusmão Lins");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial R$2500,00");
        System.out.println("***********************");

        int opcao = 0;
        double valorInicial = 2500.00;
        double saldo = valorInicial;
        double valorAdicional;
        double valorRetirada;

        String menu = "** Digite sua opção **\n" +
                "1 - Consultar saldo\n" +
                "2 - Transferir valor\n" +
                "3 - Receber valor\n" +
                "4 - Sair\n";

        // Possibilita a leitura
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo utilizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Você não possui saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
