package Desafio4;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InformaçõesConta conta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome do Títular: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Deseja fazer depósito inicial (s/n) ?");
        String opcao = sc.next();
        if (opcao == "s") {
            System.out.println("insira o valor a ser depositado: ");
            double valor = sc.nextDouble();
            conta = new InformaçõesConta(numeroConta,nomeTitular,valor);

        }else {
            conta = new InformaçõesConta(numeroConta,nomeTitular,0);
        }

        System.out.println(conta);

        System.out.println("Insira um valor de depósito: ");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Dados da conta atualizado: " + conta);

        System.out.println("Insira um valor de saque: ");
        double saque = sc.nextDouble();
        conta.saque(saque);
        System.out.println("Dados da conta atualizado: " + conta);

        sc.close();



    }

}