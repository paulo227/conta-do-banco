package estudo.github;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a conta do seu banco!!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("número: ");
        numero = scanner.nextInt();
        System.out.print("Agência: ");
        agencia = scanner.next();
        System.out.print("Nome cliente: ");
        nomeCliente = scanner.next();
        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agêcia é " + agencia
               + ", conta " + numero + " e seu saldo "  + saldo + " ja está disponivel");

    }
}
