package Desafio4;

public class ContaService {
    public void depositar(InformaçõesConta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual += quantia;
        conta.setSaldo(saldoAtual);
    }
    public void sacar(InformaçõesConta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        saldoAtual -= (quantia + 5);
        conta.setSaldo(saldoAtual);
    }
}
