package Desafio1.exercicio3.For;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeroFim= JOptionPane.showInputDialog(null,"Digite o número final da contagem");
        int numeroFinal = Integer.parseInt(numeroFim);

        for (int i = 0; i <= numeroFinal; i++) {
            JOptionPane.showMessageDialog(null,"Contagem: "+ i);


        }
    }
}