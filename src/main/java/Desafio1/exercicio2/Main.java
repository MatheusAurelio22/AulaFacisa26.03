package Desafio1.exercicio2;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um número: ");
        int numeroDia = Integer.parseInt(numero);

        switch (numeroDia){
            case 1:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"O dia da semana selecionado é Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número inválido");
                break;
        }
    }
}