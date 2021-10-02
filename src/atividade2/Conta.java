package atividade2;

public class Conta {
    private Integer cpf;
    private String nome;
    private Double saldo;
    private Double limiteSaque;

    public Conta () {}

    public Conta(Integer cpf, String nome, Double saldo, Double limiteSaque) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double deposito (Double valor) {
        return valor += saldo;
    }

   public Double saque (Double valor) {

        return valor-=saldo;

   }

    @Override
    public String toString() {
        return "Conta: "  +
                "cpf= " + cpf +
                ", nome= '" + nome + '\'' +
                ", saldo= " + saldo;
    }
}
