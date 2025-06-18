# Desafio Controle de Fluxo

Este projeto faz parte da formação **DIO - Trilha Java Básico** e tem como objetivo exercitar o conteúdo de Controle de Fluxo em Java.

## Descrição
O sistema recebe dois números inteiros via terminal e imprime a quantidade de interações entre eles. Caso o primeiro número seja maior que o segundo, uma exceção customizada é lançada.

## Requisitos
- Java 8 ou superior

## Como Executar
1. Compile os arquivos Java:
   ```sh
   javac -d bin src/Contador.java src/ParametrosInvalidosException.java
   ```
2. Execute o programa:
   ```sh
   java -cp bin Contador
   ```
3. Siga as instruções no terminal para inserir os dois números inteiros.

## Exemplo de Uso
```
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
15
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```
Se o primeiro parâmetro for maior que o segundo:
```
Digite o primeiro parâmetro
20
Digite o segundo parâmetro
10
O segundo parâmetro deve ser maior que o primeiro
```

## Estrutura dos Arquivos
```
DesafioControleFluxo/
├── src/
│   ├── Contador.java
│   └── ParametrosInvalidosException.java
├── bin/
├── lib/
└── README.md
```

## Autor
Projeto desenvolvido para a DIO por [Seu Nome].