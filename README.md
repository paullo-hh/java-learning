# java-learning

Projeto de estudo em Java criado como parte dos desafios do meu roadmap de aprendizagem. Neste repositorio eu pratico os fundamentos da linguagem com pequenos programas de terminal.

## Sobre este projeto

O estado atual do projeto e uma calculadora simples executada no terminal, feita para praticar:

- entrada de dados com `Scanner`
- estruturas de decisao com `switch`
- repeticao com `while`
- organizacao basica em classes e metodos
- operacoes matematicas em Java

Este repositorio representa uma etapa inicial da minha trilha, com foco em ganhar fluidez escrevendo codigo sem copiar.

## Funcionalidades atuais

- mensagem inicial no terminal
- menu de operacoes
- adicao
- subtracao
- multiplicacao
- divisao

## Estrutura do projeto

```text
src/
|- Main.java
|- operations/
|  |- MathOperations.java
|- watching/
   |- PrintInScreen.java
```

## Tecnologias

- Java 17
- IntelliJ IDEA

## Como executar

### Pelo IntelliJ

Abra o projeto e execute a classe `Main`.

### Pelo terminal

Compile os arquivos:

```powershell
javac -d out src\Main.java src\operations\MathOperations.java src\watching\PrintInScreen.java
```

Execute o programa:

```powershell
java -cp out Main
```

## Objetivo de aprendizado

Este projeto foi criado para reforcar os fundamentos de Java na pratica, principalmente:

- logica de programacao
- entrada e saida no terminal
- separacao de responsabilidades em classes
- primeira organizacao de um projeto Java simples

## Proximos passos

- melhorar a validacao das entradas
- tratar divisao por zero com mais seguranca
- separar melhor a logica do menu
- adicionar opcao real de sair do programa
- evoluir para desafios maiores do roadmap

## Status

Projeto de estudo em desenvolvimento.
