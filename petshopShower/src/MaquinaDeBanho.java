public class MaquinaDeBanho {
      private int nivelAgua; // litros
      private int nivelShampoo; // litros
      private Pet petNaMaquina;
      private boolean precisaLimpar;
      private final int MAX_AGUA = 30;
      private final int MAX_SHAMPOO = 10;

      public MaquinaDeBanho() {
            this.nivelAgua = 0;
            this.nivelShampoo = 0;
            this.petNaMaquina = null;
            this.precisaLimpar = false;
      }

      public boolean colocarPet(Pet pet) {
            if (petNaMaquina == null && !precisaLimpar) {
                  petNaMaquina = pet;
                  return true;
            }
            return false;
      }

      public boolean retirarPet() {
            if (petNaMaquina != null) {
                  if (!petNaMaquina.isLimpo()) {
                        precisaLimpar = true;
                  }
                  petNaMaquina = null;
                  return true;
            }
            return false;
      }

      public boolean darBanho() {
            if (petNaMaquina != null && nivelAgua >= 10 && nivelShampoo >= 2 && !precisaLimpar) {
                  nivelAgua -= 10;
                  nivelShampoo -= 2;
                  petNaMaquina.setLimpo(true);
                  return true;
            }
            return false;
      }

      public boolean abastecerAgua() {
            if (nivelAgua + 2 <= MAX_AGUA) {
                  nivelAgua += 2;
                  return true;
            }
            return false;
      }

      public boolean abastecerShampoo() {
            if (nivelShampoo + 2 <= MAX_SHAMPOO) {
                  nivelShampoo += 2;
                  return true;
            }
            return false;
      }

      public boolean limparMaquina() {
            if (nivelAgua >= 3 && nivelShampoo >= 1 && precisaLimpar && petNaMaquina == null) {
                  nivelAgua -= 3;
                  nivelShampoo -= 1;
                  precisaLimpar = false;
                  return true;
            }
            return false;
      }

      public int getNivelAgua() {
            return nivelAgua;
      }

      public int getNivelShampoo() {
            return nivelShampoo;
      }

      public boolean isPetNaMaquina() {
            return petNaMaquina != null;
      }

      public boolean precisaLimpar() {
            return precisaLimpar;
      }

      public String getNomePetNaMaquina() {
            return petNaMaquina != null ? petNaMaquina.getNome() : null;
      }
}
