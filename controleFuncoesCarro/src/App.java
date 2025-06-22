import java.util.Scanner;

public class App {
      public static void main(String[] args) {
            Car carro = new Car();
            Scanner sc = new Scanner(System.in);
            int opcao;
            do {
                  System.out.println("\n--- Menu Carro ---");
                  System.out.println("1. Ligar carro");
                  System.out.println("2. Desligar carro");
                  System.out.println("3. Acelerar");
                  System.out.println("4. Diminuir velocidade");
                  System.out.println("5. Trocar marcha");
                  System.out.println("6. Virar");
                  System.out.println("7. Verificar velocidade");
                  System.out.println("8. Sair");
                  System.out.print("Escolha: ");
                  opcao = sc.nextInt();
                  switch (opcao) {
                        case 1:
                              if (carro.ligar())
                                    System.out.println("Carro ligado!");
                              else
                                    System.out.println("Já está ligado!");
                              break;
                        case 2:
                              if (carro.desligar())
                                    System.out.println("Carro desligado!");
                              else
                                    System.out.println("Não pode desligar agora!");
                              break;
                        case 3:
                              if (carro.acelerar())
                                    System.out.println("Acelerou! Velocidade: " + carro.getVelocidade());
                              else
                                    System.out.println("Não pode acelerar!");
                              break;
                        case 4:
                              if (carro.diminuirVelocidade())
                                    System.out.println("Desacelerou! Velocidade: " + carro.getVelocidade());
                              else
                                    System.out.println("Não pode diminuir velocidade!");
                              break;
                        case 5:
                              System.out.print("Para qual marcha deseja trocar? ");
                              int novaMarcha = sc.nextInt();
                              if (carro.trocarMarcha(novaMarcha))
                                    System.out.println("Marcha trocada para " + carro.getMarcha());
                              else
                                    System.out.println("Não pode trocar para essa marcha!");
                              break;
                        case 6:
                              System.out.print("Virar para (esquerda/direita): ");
                              String dir = sc.next();
                              if (carro.virar(dir))
                                    System.out.println("Virou para " + dir);
                              else
                                    System.out.println("Não pode virar agora!");
                              break;
                        case 7:
                              System.out.println("Velocidade: " + carro.getVelocidade() + " km/h, Marcha: "
                                          + carro.getMarcha() + ", Direção: " + carro.getDirecao() + ", Ligado: "
                                          + carro.isLigado());
                              break;
                        case 8:
                              System.out.println("Saindo...");
                              break;
                        default:
                              System.out.println("Opção inválida!");
                  }
            } while (opcao != 8);
            sc.close();
      }
}
