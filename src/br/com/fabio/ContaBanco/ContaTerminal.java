package br.com.fabio.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    
    

    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema do Banco\n");

        System.out.println("=====================================");

        System.out.println("\nDigite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("\nDigite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("\nDigite o seu nome: ");
        String nomePessoa = scanner.next();

        System.out.println("\nDigite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();


        System.out.println("Conta criada com sucesso!\n");
        
        System.out.println("Olá " + nomePessoa + ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", sua conta é: " + numeroConta + " e o seu saldo: " + saldoConta + " já está disponivel para saque.");
        
        scanner.close();
    }

}
