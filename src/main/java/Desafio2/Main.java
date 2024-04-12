package Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4){

            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Visualizar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    TarefaService.adicionarTarefa(sc, tarefas);
                    break;
                case 2:
                    TarefaService.visualizarTarefa(tarefas);
                    break;
                case 3:
                    TarefaService.removerTarefa(sc,tarefas);
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida, insira uma opção válida");
            }
    }
    sc.close();

}








}

