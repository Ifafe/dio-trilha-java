# Gerador de Identificadores Únicos

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

> Gera identificadores únicos no formato `nome-numero` para sistemas backend.

## 🚀 Descrição

No desenvolvimento de sistemas backend, é comum gerar identificadores únicos para pedidos, transações e outros registros. Este programa recebe um nome e um número, e retorna um identificador no formato `nome-numero`. O nome é convertido para letras minúsculas e os espaços são removidos.

---

## 📥 Entrada

- Uma string contendo o **nome**.
- Um número inteiro representando o **ID**.

---

## 📤 Saída

- Uma string formatada no padrão: `nome-numero`, onde:
  - `nome` está em letras minúsculas e sem espaços.
  - `numero` é o ID informado.

---

## 💻 Exemplo de Uso

| Entrada           | Saída          |
| ----------------- | -------------- |
| Maria Silva\n123  | mariasilva-123 |
| João da Silva\n42 | joaodasilva-42 |
| Ana Paula\n7      | anapaula-7     |

---

## 🛠️ Como Executar

1. Compile o programa:

   ```bash
   javac -d bin src/Gerador.java
   ```

2. Execute o programa:

   ```bash
   java -cp bin Gerador
   ```

---

## 📂 Estrutura do Projeto

```text
GerarIdentificadoresUnicos/
├── src/
│   └── Gerador.java
├── bin/
│   └── Gerador.class
├── lib/
└── README.md
```

---

## ✍️ Autor

- Projeto para a trilha Java Básico da DIO.
