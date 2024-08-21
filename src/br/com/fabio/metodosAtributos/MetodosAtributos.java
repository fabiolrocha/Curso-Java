package br.com.fabio.metodosAtributos;

public class MetodosAtributos {

    // O nome do arquivo deve começar com letra maiscula e depois usar o .java
    // O nome da classe precisa ser o mesmo nome do arquivo

    public static void main(String[] args) {

        // Imprime uma mensagem na tela
        System.out.println("Eae, karai");

        // Formato de variaveis:
        // Tipo NomeBemDefinido = Atribuição (As vezes pode não conter a atribuição);

        // Algumas variaveis
        String meuNome = "Fábio";
        boolean verdade = true;

        // Variaveis que podem ser alteradas
        double PI = 3.14;
        int IDADE = 19;

        // Variaveis que nao podem sofrer alterações
        final String BR = "Brasil";
        final int ANO = 2024;

        // Chamando as variaveis
        System.out.println(meuNome);
        System.out.println(verdade);
        System.out.println(PI);
        System.out.println(IDADE);
        System.out.println(BR);
        System.out.println(ANO);

        // Variaveis não se iniciam com numeros, não pode conter espaços, não pode ser
        // palavras reservadas
        // Variaveis só podem conter letras, numeros e os caracteres "_ e $"

        // Variaveis para utilizar os metodos
        String primeiroNome = "Fábio";
        String segundoNome = "Luiz";

        // Chamando o metodo
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Mostrar o resultado do metodo
        System.out.println(nomeCompleto);

    }

    // Declarar metodos
    // public static TipoRetorno NomeObjetivoInfinitivo Parametro

    // Alguns metodos:
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    // Palavras reservadas:
    // public - Acesso a todos
    // private - Acesso somente na classe
    // protected - Acesso na classe e nas classes filhas
    // static - Não precisa instanciar a classe
    // final - Não pode ser alterado
    // void - Não retorna nada
    // int - Retorna um inteiro
    // String - Retorna uma string
    // boolean - Retorna um booleano
    // double - Retorna um double
    // float - Retorna um float
    // char - Retorna um char
    // long - Retorna um long
    // short - Retorna um short
    // byte - Retorna um byte
    // Object - Retorna um objeto
    // Tipo[] - Retorna um array
    // Tipo[][] - Retorna uma matriz
}
