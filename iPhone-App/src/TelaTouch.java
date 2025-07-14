// Representa a tela touch do iPhone
public record TelaTouch() {
      // Detecta um toque na tela
      public void detectarToque() {
            System.out.println("Toque detectado");
      }

      // Simula o gesto de deslizar
      public void deslizar() {
            System.out.println("Deslizando na tela");
      }

      // Simula o gesto de pinçar
      public void pincar() {
            System.out.println("Pinçando a tela");
      }
}
