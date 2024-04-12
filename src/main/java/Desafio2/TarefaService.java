package Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaService {
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
