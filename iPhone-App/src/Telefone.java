// Representa o aplicativo de telefone do iPhone
public record Telefone() implements Aplicativo {
      @Override
      public void abrir() {
            System.out.println("Telefone aberto");
      }

      @Override
      public void fechar() {
            System.out.println("Telefone fechado");
      }

      // Realiza uma chamada para o número informado
      public void fazerChamada(String numero) {
            System.out.println("Chamando: " + numero);
      }

      // Simula o recebimento de uma chamada
      public void receberChamada(String numero) {
            System.out.println("Recebendo chamada de: " + numero);
      }
}
