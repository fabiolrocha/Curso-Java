package br.com.fabio.EstruturasDeRepetição;

public class repeticao {
    /*
     * Estruturas de repetição:
     * For
     * While
     * Do While
     */

    /*
     * Estruturas condicionais:
     * If-Else
     * Switch-Case
     */

    /*
     * Estruturas de exeções:
     * Try-Catch-Finally
     * Throw
     */

    public static void main (String[] arg ){
        double valor = 25.0;
        double valorSolicitado = 24;

        if (valorSolicitado < valor) {
            valor = valor - valorSolicitado;

            System.out.println("Seu valor agora é: " + valor);
        } else {
            System.out.println ("Você não possui esse valor");
        }

    }
}
