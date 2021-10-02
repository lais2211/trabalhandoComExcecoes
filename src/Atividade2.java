import atividade2.Conta;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cpf do titular da conta: ");
        Integer cpf = sc.nextInt();
        System.out.println("Digite o nome do titular da conta: ");
        String nome = sc.next();
        System.out.println("Digite o saldo na conta: ");
        Double saldo = sc.nextDouble();
        System.out.println("Digite o limite para saque: ");
        Double saqueLimite = sc.nextDouble();
        Conta conta = new Conta(cpf,nome,saldo,saqueLimite);
        System.out.println(conta);

    }
}
