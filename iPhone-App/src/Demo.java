import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IPhone iphone = new IPhone();
        boolean executando = true;

// Menu interativo
        while (executando) {
            System.out.println("\n=== Menu iPhone 2007 ===");
            System.out.println("1. Ligar iPhone");
            System.out.println("2. Desligar iPhone");
            System.out.println("3. Tocar música");
            System.out.println("4. Pausar música");
            System.out.println("5. Selecionar música");
            System.out.println("6. Fazer chamada");
            System.out.println("7. Receber chamada");
            System.out.println("8. Iniciar correio de voz");
            System.out.println("9. Navegar na internet");
            System.out.println("10. Fechar página");
            System.out.println("11. Adicionar nova aba");
            System.out.println("12. Atualizar página");
            System.out.println("13. Executar aplicativo");
            System.out.println("14. Detectar toque na tela");
            System.out.println("15. Deslizar na tela");
            System.out.println("16. Pinçar na tela");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = -1;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            try {
                switch (opcao) {
                    case 1 -> iphone.ligar();
                    case 2 -> iphone.desligar();
                    case 3 -> {
                        System.out.print("Digite o nome da música: ");
                        String musica = scanner.nextLine();
                        iphone.tocarMusica(musica);
                    }
                    case 4 -> iphone.getIPod().pausarMusica();
                    case 5 -> {
                        System.out.print("Digite o nome da música: ");
                        String musica = scanner.nextLine();
                        iphone.getIPod().selecionarMusica(musica);
                    }
                    case 6 -> {
                        System.out.print("Digite o número para ligar: ");
                        String numero = scanner.nextLine();
                        iphone.getTelefone().fazerChamada(numero);
                    }
                    case 7 -> {
                        System.out.print("Digite o número que está ligando: ");
                        String numero = scanner.nextLine();
                        iphone.getTelefone().receberChamada(numero);
                    }
                    case 8 -> System.out.println("Correio de voz iniciado");
                    case 9 -> {
                        System.out.print("Digite a URL: ");
                        String url = scanner.nextLine();
                        iphone.navegarInternet(url);
                    }
                    case 10 -> iphone.getNavegador().fecharPagina();
                    case 11 -> System.out.println("Nova aba adicionada");
                    case 12 -> System.out.println("Página atualizada");
                    case 13 -> {
                        System.out.println("Escolha o aplicativo para executar:");
                        System.out.println("1. Telefone");
                        System.out.println("2. iPod");
                        System.out.println("3. Navegador de Internet");
                        int appOp = -1;
                        try {
                            appOp = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opção inválida!");
                            break;
                        }
                        switch (appOp) {
                            case 1 -> iphone.usarApp(iphone.getTelefone());
                            case 2 -> iphone.usarApp(iphone.getIPod());
                            case 3 -> iphone.usarApp(iphone.getNavegador());
                            default -> System.out.println("Aplicativo inválido!");
                        }
                    }
                    case 14 -> iphone.getTelaTouch().detectarToque();
                    case 15 -> iphone.getTelaTouch().deslizar();
                    case 16 -> iphone.getTelaTouch().pincar();
                    case 0 -> {
                        executando = false;
                        System.out.println("Saindo do iPhone. Até logo!");
                    }
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro ao executar a opção: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
