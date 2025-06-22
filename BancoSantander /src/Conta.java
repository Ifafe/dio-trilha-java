public class Conta {
      private int numero;
      private double saldo;
      private Cliente titular;
      private double limiteChequeEspecial;

      // Construtor da classe Conta sem argumentos
      public Conta() {
      }

      // Construtor da classe Conta com agumento para depósito inicial
      public Conta(int numero, Cliente titular, double depositoInicial) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = depositoInicial;
            if (depositoInicial <= 500) {
                  this.limiteChequeEspecial = 50.0;
            } else {
                  this.limiteChequeEspecial = depositoInicial * 0.5;
            }
      }

      public void depositar(double valor) {
            if (valor > 0) {
                  // Se o saldo está negativo, significa que o cheque especial foi usado
                  if (saldo < 0) {
                        double valorUsadoChequeEspecial = Math.abs(saldo);
                        double taxa = valorUsadoChequeEspecial * 0.2;
                        saldo += valor; // Primeiro deposita
                        // Se o depósito for suficiente para cobrir o saldo negativo + taxa, desconta a
                        // taxa
                        if (saldo >= 0) {
                              saldo -= taxa;
                        } else {
                              // Se ainda ficou negativo, taxa será cobrada quando o saldo ficar positivo
                        }
                  } else {
                        saldo += valor;
                  }
            }
      }

      public boolean sacar(double valor) {
            if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
                  saldo -= valor;
                  return true;
            }
            return false;
      }

      public double getSaldo() {
            return saldo;
      }

      public double getLimiteChequeEspecial() {
            return limiteChequeEspecial;
      }

      public void setLimiteChequeEspecial(double limiteChequeEspecial) {
            this.limiteChequeEspecial = limiteChequeEspecial;
      }

      public Cliente getTitular() {
            return titular;
      }

      public int getNumero() {
            return numero;
      }

      public void setTitular(Cliente titular) {
            this.titular = titular;
      }

      public void setNumero(int numero) {
            this.numero = numero;
      }

      public void setSaldo(double saldo) {
            this.saldo = saldo;
      }

      public boolean isUsandoChequeEspecial() {
            return saldo < 0;
      }
}
