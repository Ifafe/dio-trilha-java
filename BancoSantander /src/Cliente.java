public class Cliente {
      private String nome;
      private String cpf;

      // Construtor da classe Cliente sem argumentos
      public Cliente() {
      }
      // Construtor da classe Cliente com argumentos
      public Cliente(String nome, String cpf) 
      {
            this.nome = nome;
            this.cpf = cpf;
      }


      public String getNome() 
      {
            return nome;
      }

      public String getCpf() 
      {
            return cpf;
      }
      public void setNome(String nome) 
      {
            this.nome = nome;
      }
      public void setCpf(String cpf) 
      {
            this.cpf = cpf;
      }
      @Override
      public String toString() 
      {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    '}';
      }
}
