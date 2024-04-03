package Desafio1.exercicio3.While;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numFim = JOptionPane.showInputDialog(null,"Digite o número final da contagem");
        int numeroFinal = Integer.parseInt(numFim);
        int num = 0;

        while (num <= numeroFinal) {

            JOptionPane.showMessageDialog(null,"Contagem: "+num);
            num++;


        }
    }
}

