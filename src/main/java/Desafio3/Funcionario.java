package Desafio3;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa){
        this.nome =nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double obterSalarioLiquido(){
        return salarioBruto *(1-taxa);
    }

    public void aumentoDeSalario(double percentage){
        salarioBruto += salarioBruto * (percentage/100);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", taxa=" + taxa +
                '}';
    }
}
