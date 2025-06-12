import java.util.Scanner;

// File: ContaTerminal.java
class Conta_Terminal {
    // Attributes of the ContaTerminal class
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    // Constructor for the ContaTerminal class
    public Conta_Terminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Main class to run the ContaTerminal application
    public static void main(String[] args) throws Exception {

        Conta_Terminal[] ContaTerminal = new Conta_Terminal[10];
        System.out.println();
        System.out.println("Olá, Seja bem vindo ao Banco Santander!");
        System.out.println("Estamos aqui para te ajudar a abrir sua conta.");
        System.out.println("Por favor, preencha os dados solicitados abaixo.");
        System.out.println("Você pode cadastrar até 10 contas.");
        System.out.println("##########################################################");
        System.out.println();
        // Create a Scanner object to read input from the user
        // and read account details for 10 accounts
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ContaTerminal.length; i++) {
            System.out.println("Cadastro da conta " + (i + 1));
            ContaTerminal[i] = lerConta(scanner);
            System.out.println("##########################################################");
            System.out.println();
            System.out.println("Conta " + (i + 1) + " cadastrada com sucesso!");
            System.out.println("Deseja cadastrar mais uma conta? (S/N)");
            String resposta = scanner.nextLine().trim().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
            ClearScreen();
        }
        System.out.println("##########################################################");
        System.out.println("Contas cadastradas com sucesso!");
        System.out.println("Confira os dados das contas cadastradas:");
        // Display the details of each account
        for (Conta_Terminal conta : ContaTerminal) {
            System.out.println(
                    "Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                            + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo
                            + " já está disponível para saque.");
        }
        scanner.close();
    }

    // Method to display account details
    private static Conta_Terminal lerConta(Scanner scanner) {
        System.out.print("Por favor, digite o número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());
        return new Conta_Terminal(numero, agencia, nomeCliente, saldo);
    }

    // Method to clear the screen
    private static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
