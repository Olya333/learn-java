package com.company.lesson4;

public class BankAccount {

    int id= 10;
    String name = "Petr";
    double balance = 100;


    void popolnenieScheta(double summaPopolneniya){

        System.out.println("Balans do popolnenia: " + balance);
        System.out.println("Balans popolnenia na: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balans posle popolnenia: "+ balance);
        System.out.println();

    }

    void snyatieSoScheta(double summaSnyatiya){

        System.out.println("Balans do snytiya: " + balance);
        System.out.println("Balans izmenyaetsya na: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balans posle snyatia: "+ balance);
        System.out.println();

    }

}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();


        myAccount.popolnenieScheta(30.5);
        myAccount.snyatieSoScheta(20.5);
    }


}


