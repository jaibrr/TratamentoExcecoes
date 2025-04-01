package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta bancária: ");
        int number = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String name  = sc.nextLine();
        System.out.print("Balanço inicial: $ ");
        Double initialBalance  = sc.nextDouble();
        System.out.print("Limite de saque: $ ");
        Double withdrawLimit  = sc.nextDouble();
        Account acc = new Account(number, name, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Insira valor para saque: $ ");
        Double withdraw = sc.nextDouble();

        try{
            acc.withdraw(withdraw);
            System.out.println("Novo valor em conta: $ " + acc.getBalance());
        }
        catch (DomainException e)
        {
            System.out.println("Erro no saque: " + e.getMessage());
        }

        sc.close();

    }
}
