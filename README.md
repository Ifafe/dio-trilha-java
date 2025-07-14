# Projetos Práticos – Trilha Java Básico 🚀

Bem-vindo(a) ao meu repositório de projetos práticos desenvolvidos durante a trilha de Java Básico! Aqui você encontrará exercícios e desafios que me ajudaram a consolidar os principais conceitos da linguagem Java.

## 📚 Projetos

- **conta-banco**  
  Simulação de abertura de conta bancária via terminal.

- **DesafioControleFluxo**  
  Exercícios de controle de fluxo, incluindo tratamento de exceções personalizadas.

- **GerarIdentificadoresUnicos**  
  Geração de identificadores únicos utilizando lógica em Java.

- **RedirecionamentoURLsPadronizadas**  
  Manipulação e padronização de URLs.

- **BancoSantander**  
  Sistema de conta bancária orientado a objetos, com as seguintes funcionalidades:

  - Consultar saldo e cheque especial
  - Depositar e sacar dinheiro
  - Pagar boletos
  - Verificar se a conta está usando cheque especial
  - Menu interativo para o usuário

  **Estrutura:**

  - `Banco.java`: Classe principal, responsável pelo menu interativo e execução do sistema.
  - `Cliente.java`: Representa o cliente do banco, com dados pessoais e métodos de acesso.
  - `Conta.java`: Classe da conta bancária, com atributos privados, métodos para operações bancárias e lógica de cheque especial.

  O limite do cheque especial é definido conforme o valor do depósito inicial, e há cobrança de taxa caso o limite seja utilizado, conforme as regras do exercício.

- **controleFuncoesCarro**  
  Simulação de controle de um carro com menu interativo, permitindo:

  - Ligar e desligar o carro
  - Acelerar e diminuir velocidade
  - Virar para esquerda/direita
  - Verificar velocidade
  - Trocar marcha

  **Estrutura:**

  - `App.java`: Classe principal, responsável pelo menu interativo e execução do sistema.
  - `Car.java`: Classe que representa o carro, com atributos privados e métodos para todas as funções e regras do veículo (ligar, desligar, acelerar, trocar marcha, etc).

  O sistema respeita regras de segurança e funcionamento, como limites de velocidade por marcha, restrições para virar e desligar, e impede ações inválidas conforme o exercício proposto.

- **iPhone-App**  
  Projeto que simula as principais funcionalidades do iPhone 2007, com ênfase em Programação Orientada a Objetos (POO), uso de **interfaces** e **records** para modelagem moderna e robusta.

  - Utiliza interfaces para definir contratos das funcionalidades (reprodutor musical, telefone, navegador de internet, etc).
  - Aplica records para representar dados imutáveis e facilitar a manutenção do código.
  - Demonstra encapsulamento, modularidade e reutilização de código.
  - Menu interativo para o usuário explorar as funções do iPhone simulado.

  **Principais classes e conceitos:**

  - `Demo.java`: Menu interativo e gerenciamento das funcionalidades.
  - `Aplicativo.java` (interface): Contrato para apps do sistema.
  - `IPhone.java`: Classe principal do aparelho.
  - `IPod.java`, `Telefone.java`, `NavegadorInternet.java`, `TelaTouch.java`: Implementações das funcionalidades do iPhone.

  Este projeto destaca o uso de recursos modernos do Java, como records e interfaces, reforçando boas práticas de POO e design orientado a contratos.

## 💡 Objetivo

O objetivo deste repositório é compartilhar minha evolução na linguagem Java, além de servir como referência para quem está começando e deseja ver exemplos práticos de código.

## 🛠️ Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
2. Navegue até o diretório do projeto desejado.
3. Compile os arquivos `.java`:
   ```sh
   javac src/NomeDoArquivo.java -d bin
   ```
4. Execute o programa:
   ```sh
   java -cp bin NomeDaClasse
   ```

## 🤝 Contribuição

Fique à vontade para abrir issues ou enviar pull requests com sugestões, melhorias ou correções!
