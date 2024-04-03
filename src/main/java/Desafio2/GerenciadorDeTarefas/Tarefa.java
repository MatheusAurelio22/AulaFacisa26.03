package Desafio2.GerenciadorDeTarefas;

public class Tarefa {
    private String nome;

    public Tarefa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
