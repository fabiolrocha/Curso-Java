package br.com.fabio.ContaBanco;

//Usada para importar a classe Scanner que serve para scannear o que é escrito pela pessoa no terminal
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] arg) {
        // Como se inicia a classe scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema do Banco\n");

        System.out.println("=====================================");

        System.out.println("\nDigite o número da conta:");
        // Usada para escanear o que é escrito no terminal no formato de número inteiro
        int numeroConta = scanner.nextInt();

        System.out.println("\nDigite o número da agência: ");
        // Usada para escanear o que é escrito no terminal no formato de string
        String numeroAgencia = scanner.next();

        System.out.println("\nDigite o seu nome: ");
        // Usada para escanear o que é escrito no terminal no formato de string
        String nomePessoa = scanner.next();

        System.out.println("\nDigite o saldo da conta: ");
        // Usada para escanear o que é escrito no terminal no formato de número double
        double saldoConta = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!\n");

        System.out.println("Olá " + nomePessoa + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", sua conta é: " + numeroConta + " e o seu saldo: " + saldoConta + " já está disponivel para saque.");

        scanner.close();
    }

}
