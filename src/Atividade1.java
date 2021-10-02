import atividade1.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat ("dd/MM/yyyy");

        try {
            System.out.println("Gostariamos de fazer o cadastro da sua reserva, digite em seguida o numero do quarto.");
            System.out.println("Quarto: ");
            Integer quarto = sc.nextInt();
            System.out.println("Digite o dia de entrada: dd/mm/yyyy");
            Date entrada = dataFormato.parse(sc.next());
            System.out.println("Digite o dia de saida: dd/mm/yyyy");
            Date saida = dataFormato.parse(sc.next());
            Reserva reserva = new Reserva(quarto, entrada, saida);
            System.out.println("RESERVA: " + reserva);

            System.out.println("Atualize as datas de entrada e saida:");
            System.out.println("Entrada: ");
            Date entradaAtualizada = dataFormato.parse(sc.next());
            System.out.println("Saida: ");
            Date saidaAtualizada = dataFormato.parse(sc.next());
            reserva.atualizarDatasReserva(entradaAtualizada,saidaAtualizada);
            System.out.println("RESERVA: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato invalido de data!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro da reserva: " + e.getMessage());
        }
        sc.close();
    }
}
