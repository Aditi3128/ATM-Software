package ATMachine;

import java.util.Scanner;

class ATM{
    float balance;
    int PIN;
    public void checkpin(){
        System.out.println("enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("enter a valid pin:");
        }
    }

    public void menu(){
        System.out.println("enter your choice");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();

        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
          }
          else{
            System.out.println("enter a valid choice");
          }
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw:");
        Scanner sc = new Scanner (Systen.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Sucessful");

        }
        menu();

    }
    public void depositMoney(){
        System.out.println("Enter the Amount:");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Sucessfully");
    }
}


public class ATMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
        
    }
}
