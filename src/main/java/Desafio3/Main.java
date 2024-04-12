package Desafio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Antonio",2500,0.15);
        Funcionario funcionario2 = new Funcionario("Jubileu",4300,0.2);

        JOptionPane.showMessageDialog(null,"===Informações dos Funcionários:===");
        JOptionPane.showMessageDialog(null,"Antonio: "+ funcionario1);
        JOptionPane.showMessageDialog(null,"Jubileu: "+ funcionario2);

        funcionario1.aumentoDeSalario(10);

        JOptionPane.showMessageDialog(null,"===Informações após o aumento salarial:===");
        JOptionPane.showMessageDialog(null,"Antonio: "+ funcionario1);
        JOptionPane.showMessageDialog(null,"Jubileu: "+funcionario2);

        JOptionPane.showMessageDialog(null,"===Salário líquido dos funcionários:===");
        JOptionPane.showMessageDialog(null,"Antonio"+ funcionario1.obterSalarioLiquido());
        JOptionPane.showMessageDialog(null,"Jubileu"+ funcionario2.obterSalarioLiquido());

    }
}
