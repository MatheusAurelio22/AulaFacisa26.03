package Desafio1.exercicio1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        String numero = JOptionPane.showInputDialog(null,"Digite um número para saber sua natureza: ");
        int numeroEscolha = Integer.parseInt(numero);

        if (numeroEscolha > 0) {
            JOptionPane.showMessageDialog(null, "O seu número é positivo!!");

        }else if (numeroEscolha < 0) {
            JOptionPane.showMessageDialog(null,"O seu número é negativo!!");
        }else {
            JOptionPane.showMessageDialog(null,"Seu número é neutre!!");
        }



    }
}
