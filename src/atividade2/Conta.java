package atividade2;

public class Conta {
    private Long cpf;
    private String nome;
    private Double saldo;
    private Double limiteSaque;
    private Double saque;

    public Conta () {}

    public Conta(Long cpf, String nome, Double saldo, Double limiteSaque) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Conta (Double saque) {
        this.saque = saque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public Long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double sacar () {

        return saldo-saque;

   }

   public void saque2 (Double saque,Double limiteSaque, Double saldo) {

        if (saque>limiteSaque) {

            throw new IllegalArgumentException("Valor do saque maior do que limite permitido.");}

        if (saque>saldo) {

            throw new IllegalArgumentException("O valor do saque é maior que o valor em conta.");}

        this.saque= saque;
        this.limiteSaque = limiteSaque;
        this.saldo = saldo;

        }


    @Override
    public String toString() {
        return "Conta: "  +
                "cpf= " + cpf +
                ", nome= '" + nome + '\'' +
                ", saldo= " + saldo +
                ", limite= " + limiteSaque;
    }


}
