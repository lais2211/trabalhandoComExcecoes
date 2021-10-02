package atividade1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer quarto;
    private Date entrada;
    private Date saida;

    SimpleDateFormat dataFormato = new SimpleDateFormat ("dd/MM/yyyy");

    public Reserva(Date entradaAtualizada, Date saidaAtualizada) {}

    public Reserva (Integer quarto, Date entrada, Date saida) {

        this.quarto = quarto;
        this.entrada = entrada;
        this.saida = saida;

    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public Date getEntrada() {
        return entrada;
    }


    public Date getSaida() {
        return saida;
    }


    public long duração () {
        long diferença = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(diferença, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatasReserva (Date entrada, Date saida) {

        Date agora = new Date();
        if (entrada.before(agora) || saida.before(agora)) {
            throw new IllegalArgumentException("Datas para reserva devem ser datas futuras!"); }
        if (!saida.after(entrada)) {
            throw new IllegalArgumentException("Data de saida deve ser depois da entrada!");}

        this.entrada = entrada;
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Reserva de quarto: " +
                quarto +
                ", com entrada no dia: "
                + dataFormato.format(entrada)
                +", e saida no dia: "+
                dataFormato.format(saida)+
                ", sua estadia foi de: "+
                duração()+
                " dias.";
                }
}
