import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int balance = 10000;
        int withdraw, deposit;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choice 1: Withdraw money:");
            System.out.println("Choice 2: Deposit money:");
            System.out.println("Choice 3: View current balance:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdrawn: £10 £20 £30 £40");
                    withdraw = scanner.nextInt();
                    if (withdraw % 10!= 0) {
                        System.out.println("please choose: £10 £20 £30 £40");}

                    else if (balance < withdraw){
                        System.out.println("insufficient funds :" + balance);
                    }
                    else {
                    balance = balance - withdraw;
                    System.out.println("please collect your money");
                    System.out.println("");}
                    break;
                case 2:
                    System.out.println("Enter money to be deposited");
                    deposit = scanner.nextInt();
                    deposit = balance + deposit;
                    System.out.println("your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance :" + balance);
                    System.out.println("");
                    break;


            }


        }
    }
}