package SimulandoUmaContaBancária;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner EntradaDeDados = new Scanner(System.in);
        boolean Terminar = false;
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Bem-vindo ao Banco Java!");

        while (!Terminar) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println();
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            int opcao = EntradaDeDados.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    conta.depositar();
                    break;
                case 2:
                    conta.sacar();
                    break;
                case 3:
                    conta.verSaldo();
                    break;
                case 4:
                    Terminar = true;
                    System.out.println("Obrigado por usar o Banco Java!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println();
            }
        }

        EntradaDeDados.close();
    }

}
