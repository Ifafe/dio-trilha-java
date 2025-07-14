// Representa o navegador de internet do iPhone
public record NavegadorInternet() implements Aplicativo {
      @Override
      public void abrir() {
            System.out.println("Navegador aberto");
      }

      @Override
      public void fechar() {
            System.out.println("Navegador fechado");
      }

      // Abre uma página pela URL
      public void abrirPagina(String url) {
            System.out.println("Abrindo página: " + url);
      }

      // Fecha a página atual
      public void fecharPagina() {
            System.out.println("Página fechada");
      }
}
