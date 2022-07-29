import Bank_System.Bank_System;

import java.util.Scanner;
import java.lang.Exception;

class MyException extends Exception
{
    void printError()
    {
        System.out.println("Enter valid amount! \n");

    }
}

public class BankSystemE {
    static float Balance=500;

    Scanner sc=new Scanner(System.in);

    void Bank_System() {
        int Account;
        System.out.print("Enter the acount no:");
        Account=sc.nextInt();
        String Name;
        System.out.print("Enter your Name:");
        Name=sc.nextLine();
    }

    void deposit(){
        int amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = sc.nextInt();
        if ( amount <=0 ) {
            System.out.println("Enter valid amount ");
        } else {
            Balance = Balance+amount;
            System.out.println("Deposited! Account Balance is "+Balance);
        }
    }

    static void withdraw(int amount)throws MyException{
        if(amount <=0){
            throw new MyException();
        }else{
            float newBalance = Balance-amount;
            if(newBalance >=  500)
            {
                Balance = newBalance;
                System.out.println("Amount Withdrawn!! Available Balance: "+Balance);
            }
            else
            {
                throw new MyException();
            }

        }
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        Bank_System myObj = new Bank_System();
        int Key;
        do {


            System.out.println("\n1. Enter Account info\n2. Deposit\n 3.Withdrawal\n 4.Exit ");
            System.out.println("Enter Ur Choice :");Key= scan.nextInt();


            switch (Key) {
                case 1:
                    myObj.Bank_System();
                    break;

                case 2:
                    myObj.deposit();
                    break;

                case 3:
                    myObj.withdraw();
                    Scanner in=new Scanner(System.in);
                    System.out.println("Enter Amount to be Withdrawn:");
                    int amount = in.nextInt();
                    try {
                        BankSystemE.withdraw(amount);
                    } catch (MyException e) {
                        e.printError();
                    }
                    break;
                default:
                    System.out.println("Exit");;

            }
        } while (Key!=4);


    }

}




