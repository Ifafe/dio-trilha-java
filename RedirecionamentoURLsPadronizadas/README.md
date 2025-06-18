## Descrição

Ao desenvolver um sistema de redirecionamento de links, é fundamental garantir que todas as URLs estejam padronizadas para evitar inconsistências e problemas de acesso. Este desafio propõe a criação de um programa que normalize URLs seguindo regras específicas.

## Regras de Normalização

- Todas as letras devem ser convertidas para minúsculas.
- Espaços extras no início e no fim da URL devem ser removidos.

## Objetivo

Escreva um programa que receba uma URL digitada pelo usuário e retorne a versão normalizada conforme as regras acima.

## Entrada

- Uma única linha contendo a URL, que pode conter letras maiúsculas e minúsculas misturadas, além de possíveis espaços no início ou no fim.

## Saída

- A URL normalizada, com todos os caracteres em minúsculas e sem espaços extras no início ou no fim.
- A saída deve corresponder exatamente ao formato esperado, sem espaços adicionais ou alterações na estrutura da URL.

## Exemplos

| Entrada                  | Saída                  |
| ------------------------ | ---------------------- |
| ` WWW.Exemplo.COM/Path ` | `www.exemplo.com/path` |
| `GoOgLe.com/SEARCH`      | `google.com/search`    |
| `  Dio.ME/Trilha JAVA  ` | `dio.me/trilha java`   |

> Teste seu programa com os exemplos acima e outros casos para garantir a robustez da solução.
