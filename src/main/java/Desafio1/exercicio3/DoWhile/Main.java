package Desafio1.exercicio3.DoWhile;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
            String numFim = JOptionPane.showInputDialog(null,"Digite o número final da contagem");
            int numeroFinal = Integer.parseInt(numFim);
            int num = 0;

            do {
                JOptionPane.showMessageDialog(null, "Contagem: "+num);
                num++;

            }    while (num <= numeroFinal) ;
        }
}

