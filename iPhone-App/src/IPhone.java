// Classe principal que agrega as funcionalidades do iPhone
public class IPhone {
      private final Telefone telefone;
      private final IPod ipod;
      private final NavegadorInternet navegador;
      private final TelaTouch telaTouch;

      public IPhone() {
            this.telefone = new Telefone();
            this.ipod = new IPod();
            this.navegador = new NavegadorInternet();
            this.telaTouch = new TelaTouch();
      }

      // Liga o iPhone 
      public void ligar() {
            System.out.println("iPhone ligado");
      }

      // Desliga o iPhone
      public void desligar() {
            System.out.println("iPhone desligado");
      }

      // Executa um aplicativo
      public void usarApp(Aplicativo app) {
            app.abrir();
      }

      // Atalho para tocar música usando o iPod
      public void tocarMusica(String musica) {
            ipod.tocarMusica(musica);
      }

      // Atalho para navegar na internet
      public void navegarInternet(String url) {
            navegador.abrirPagina(url);
      }

      // Getters para os componentes
      public Telefone getTelefone() {
            return telefone;
      }

      public IPod getIPod() {
            return ipod;
      }

      public NavegadorInternet getNavegador() {
            return navegador;
      }

      public TelaTouch getTelaTouch() {
            return telaTouch;
      }
}
