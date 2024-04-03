package Desafio2.GerenciadorDeTarefas;

import javax.swing.*;
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
                    adicionarTarefa(sc, tarefas);
                    break;
                case 2:
                    visualizarTarefa(tarefas);
                    break;
                case 3:
                    removerTarefa(sc,tarefas);
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

    public static void adicionarTarefa(Scanner sc, ArrayList<Tarefa> tarefas){
        sc.nextLine();
        System.out.println("Digite o nome da Tarefa: ");
        String nome = sc.nextLine();

        for (Tarefa tarefa : tarefas){
            if (tarefa.getNome().equalsIgnoreCase(nome)){
                System.out.println("Erro: Tarefa Já existente");
                return;
            }
        }
        Tarefa novaTarefa = new Tarefa(nome);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada");
    }

    public static void visualizarTarefa(ArrayList<Tarefa> tarefas){
        if (tarefas.isEmpty()){
            System.out.println("Não há Tarefas Cadastradas");
        } else {
            System.out.println("===Tarefas===");
            for (Tarefa tarefa: tarefas){
                System.out.println(tarefa);
            }
        }
    }

    public static void removerTarefa(Scanner  scanner, ArrayList<Tarefa> tarefas){
        if (tarefas.isEmpty()){
            System.out.println("´Não há tarefas cadastradas");
        } else {
            System.out.println("Digite o nome da tarefa que será Removida: ");
            String nome = scanner.next();

            boolean removido = false;
            for (int i = 0; i < tarefas.size();i++){
                if (tarefas.get(i).getNome().equalsIgnoreCase(nome)){
                    tarefas.remove(i);
                    removido = true ;
                    System.out.println("Tarefa Removida");
                    break;
                }

            }

            if (!removido){
                System.out.println("Erro: Tarefa não existente");
            }
        }
    }


}

