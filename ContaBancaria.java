package SimulandoUmaContaBancária;

import java.util.Scanner;

public class ContaBancaria {

    Scanner EntradaDeDados = new Scanner(System.in);

    private double Saldo = 0.0;

    private double getSaldo() {
        return Saldo;
    }

    private void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public void depositar() {
        System.out.print("Digite o valor a ser depositado: ");
        double valor = EntradaDeDados.nextDouble();
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso! Saldo atual: " + getSaldo());
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar() {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = EntradaDeDados.nextDouble();
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso! Saldo atual: " + getSaldo());
        } else if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

}
