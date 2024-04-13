package Desafio4;

public class InformaçõesConta {
    public int numeroDaConta;
    public String nomeDoTitular;
    public double saldo;

    public InformaçõesConta(){

    }

    public InformaçõesConta(int numero, String nomeTitular, double saldo) {
        this.numeroDaConta = numero;
        this.nomeDoTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        saldo = saldo - (quantia+5);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numeroDaConta +
                ", Nometitular='" + nomeDoTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
