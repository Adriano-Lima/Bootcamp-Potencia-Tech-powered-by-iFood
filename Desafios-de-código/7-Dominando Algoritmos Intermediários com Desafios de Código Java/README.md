# Dominando Algoritmos Intermediários com Desafios de Código Java

## 🛑 Pré-Requisitos

<p>
✅ Conhecer a sintaxe da linguagem de programação Java<br>
✅ Java JDK 17<br>
✅ IDE para desenvolvimento Java (utilizei IntelliJ)<br>
</p>


## Entenda o Objetivo de cada Desafio:


## **Desafio**: Checagem de Palíndromo

Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 

Logo, NÃO é um Palíndromo. 

Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.

## **Entrada**

A entrada consiste em um palavra.

## **Saída**

Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.

| Exemplos de Entrada | Exemplos de Saída |
| :-----------------: | :---------------: |
|        radar        |       TRUE        |
|       digital       |       FALSE       |
|         ana         |       TRUE        |

- [Clique aqui para acessar o Código.](https://github.com/Adriano-Lima/Bootcamp-Potencia-Tech-powered-by-iFood/blob/main/Desafios-de-c%C3%B3digo/7-Dominando%20Algoritmos%20Intermedi%C3%A1rios%20com%20Desafios%20de%20C%C3%B3digo%20Java/dominando-algoritmos-intermediarios/src/palindromo/Desafio.java)

------

## **Desafio**: Validação de Parênteses 

Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

## **Entrada**

Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

## **Saída**

A saída corresponde a um valor Booleano como no exemplo abaixo:

| **Entrada** | **Saída** |
| :---------: | :-------: |
|     [ ]     |   true    |
|     ( )     |   true    |
|     [ )     |   false   |

- [Clique aqui para acessar o Código.](https://github.com/Adriano-Lima/Bootcamp-Potencia-Tech-powered-by-iFood/blob/main/Desafios-de-c%C3%B3digo/7-Dominando%20Algoritmos%20Intermedi%C3%A1rios%20com%20Desafios%20de%20C%C3%B3digo%20Java/dominando-algoritmos-intermediarios/src/validacao/ValidParentheses.java)

------

## **Desafio**: Quadrados Perfeitos 

Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

## **Entrada**

A entrada consiste em um número inteiro n, representando o valor total. 

## **Saída**

A saída consiste em retornar o menor número de números quadrados perfeitos. 

 

| EXEMPLO DE ENTRADA | EXEMPLO DE SAÍDA |
| :----------------: | :--------------: |
|         12         |        3         |
|         13         |        2         |
|         10         |        2         |

- [Clique aqui para acessar o Código.](https://github.com/Adriano-Lima/Bootcamp-Potencia-Tech-powered-by-iFood/blob/main/Desafios-de-c%C3%B3digo/7-Dominando%20Algoritmos%20Intermedi%C3%A1rios%20com%20Desafios%20de%20C%C3%B3digo%20Java/dominando-algoritmos-intermediarios/src/quadrados/perfeitos/Desafio.java)

------

## **Desafio**: Classificando Matrizes

Dado um array inteiro `nums`, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.

Retorne ***qualquer array** que satisfaça essa condição*.


## **Entrada**

A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

## **Saída**

A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares, conforme exemplo abaixo:

**Exemplo 1**

|  Entrada  |  Saída  |
| :-------: | :-----: |
| 4 3 1 2 4 | 2 4 3 1 |

- [Clique aqui para acessar o Código.](https://github.com/Adriano-Lima/Bootcamp-Potencia-Tech-powered-by-iFood/blob/main/Desafios-de-c%C3%B3digo/7-Dominando%20Algoritmos%20Intermedi%C3%A1rios%20com%20Desafios%20de%20C%C3%B3digo%20Java/dominando-algoritmos-intermediarios/src/matrizes/Main.java)

------

## **Desafio**: Fatorial Desajeitado

O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'. Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.

## **Entrada**

A entrada consiste em um valor inteiro positivo N.

## **Saída**

A saída consiste em retornar o valor do seu fatorial desajeitado de N, conforme exemplo abaixo.

**Exemplo 1:**

| Entrada | Saída |
| :-----: | :---: |
|    4    |   7   |

Explicação: 7 = 4 * 3 / 2 + 1 

**Exemplo 2:**

| Entrada | Saída |
| :-----: | :---: |
|   10    |  12   |

Explicação: 12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1

- [Clique aqui para acessar o Código.](https://github.com/Adriano-Lima/Bootcamp-Potencia-Tech-powered-by-iFood/blob/main/Desafios-de-c%C3%B3digo/7-Dominando%20Algoritmos%20Intermedi%C3%A1rios%20com%20Desafios%20de%20C%C3%B3digo%20Java/dominando-algoritmos-intermediarios/src/fatorial/ConsoleApp1.java)



