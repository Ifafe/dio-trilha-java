import java.util.Scanner;

public class Banco {

    static Cliente cliente = new Cliente();
    static Conta conta = new Conta();
    static Scanner scanner = new Scanner(System.in);
    static int opcao = 0;

    public static void main(String[] args) throws Exception {

        do {
            menu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    consultarLimiteChequeEspecial();
                    break;
                case 4:
                    depositarDinheiro();
                    break;
                case 5:
                    sacarDinheiro();
                    break;
                case 6:
                    pagarBoleto();
                    break;
                case 7:
                    verificarChequeEspecial();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - criar conta");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Consultar Limite Cheque Especial");
        System.out.println("4 - Depositar dinheiro");
        System.out.println("5 - Sacar dinheiro");
        System.out.println("6 - Pagar um boleto");
        System.out.println("7 - Verificar se a conta está usando cheque especial");
        System.out.println("0 - Sair");
    }

    public static void criarConta() {
        System.out.println("Criando conta...");
        scanner.nextLine(); // Limpa buffer do scanner

        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do titular: ");
        String cpf = scanner.nextLine();

        cliente.setNome(nome);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        conta.setNumero(numeroConta);

        System.out.print("Deposite o valor inicial: ");
        double saldoInicial = scanner.nextDouble();
        conta.setSaldo(saldoInicial);

        conta = new Conta(numeroConta, cliente, saldoInicial);

        System.out.println("Conta criada com sucesso!");
    }

    public static void consultarSaldo() {
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }

    public static void consultarLimiteChequeEspecial() {
        System.out.println("Limite Cheque Especial: R$" + conta.getLimiteChequeEspecial());
    }

    public static void depositarDinheiro() {
        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$" + conta.getSaldo());
    }

    public static void sacarDinheiro() {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = scanner.nextDouble();
        boolean sucesso = conta.sacar(valor);
        if (sucesso) {
            System.out.println("Saque realizado com sucesso! Saldo atual: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque falhou! Saldo insuficiente.");
        }
    }

    public static void pagarBoleto() {
        System.out.print("Digite o valor do boleto: ");
        double valor = scanner.nextDouble();
        boolean sucesso = conta.sacar(valor);
        if (sucesso) {
            System.out.println("Boleto pago com sucesso! Saldo atual: R$" + conta.getSaldo());
        } else {
            System.out.println("Pagamento falhou! Saldo insuficiente.");
        }
    }

    public static void verificarChequeEspecial() {
        if (conta.isUsandoChequeEspecial()) {
            System.out.println("A conta está usando cheque especial.");
        } else {
            System.out.println("A conta não está usando cheque especial.");
        }
    }

}
