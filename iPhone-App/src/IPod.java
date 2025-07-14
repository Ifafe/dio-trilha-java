// Representa o aplicativo de música (iPod) do iPhone
public record IPod() implements Aplicativo {
      @Override
      public void abrir() {
            System.out.println("iPod aberto");
      }

      @Override
      public void fechar() {
            System.out.println("iPod fechado");
      }

      // Toca a música informada
      public void tocarMusica(String musica) {
            System.out.println("Tocando: " + musica);
      }

      // Pausa a música atual
      public void pausarMusica() {
            System.out.println("Música pausada");
      }

      // Seleciona uma música
      public void selecionarMusica(String musica) {
            System.out.println("Selecionando: " + musica);
      }
}
