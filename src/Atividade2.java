import atividade2.Conta;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try   {
        System.out.println("Digite o cpf do titular da conta: ");
        Long cpf = sc.nextLong();
        System.out.println("Digite o nome do titular da conta: ");
        String nome = sc.next();
        System.out.println("Digite o saldo na conta: ");
        Double saldo = sc.nextDouble();
        System.out.println("Digite o limite para saque: ");
        Double saqueLimite = sc.nextDouble();
        Conta conta = new Conta(cpf,nome,saldo,saqueLimite);
        System.out.println(conta);

            System.out.println("Digite o valor do saque:");
            Double saque = sc.nextDouble();
            Conta sq = new Conta(saque);
            sq.saque2(saque,saqueLimite,saldo);
            System.out.println("O valor da conta atual é de: R$" + sq.sacar());
        }
        catch (IllegalArgumentException e) {

            System.out.println("Erro: "+ e.getMessage());

        }
        sc.close();
    }
}
