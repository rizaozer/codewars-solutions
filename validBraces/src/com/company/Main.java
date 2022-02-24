package com.company;

import java.util.Scanner;
import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            boolean flag = true;
            boolean isLoggedIn = false;
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // BankAccount class blueprint
            class BankAccount {
                private String card;
                private String card2;
                private String card3;
                private String pin;

                BankAccount() {

                }

                public String getCard() {
                    return card;
                }

                public String getPin() {
                    return pin;
                }

                public void generateCard() {
                    this.card = "400000";
                    card2 = String.format("%05d", random.nextInt(100000));
                    card3 = String.format("%05d", random.nextInt(100000));
                    card += card2;
                    card += card3;
                }

                public void generatePin() {
                    pin = String.format("%04d", random.nextInt(10000));
                }

            }

            BankAccount bank1 = new BankAccount();

            // If the user is logged in

            while(flag && isLoggedIn) {

                System.out.println("1. Balance");
                System.out.println("2. Log out");
                System.out.println("0. Exit\n");

                String decision = scanner.nextLine();

                // switch statement
                switch (decision) {
                    case "1":
                        // balance
                        System.out.println("Balance: 0\n");
                        break;

                    case "2":
                        // log out
                        isLoggedIn = false;
                        System.out.println("You are successfully logged out!\n");
                        System.out.println("1. Create an account");
                        System.out.println("2. Log into account");
                        System.out.println("0. Exit\n");
                        break;

                    case "0":
                        // exit
                        System.out.println("Bye!\n");
                        flag = false;
                        break;
                }
            }

            // If the user is NOT logged in
            while(flag && !isLoggedIn) {
                System.out.println("1. Create an account");
                System.out.println("2. Log into account");
                System.out.println("0. Exit\n");

                String decision = scanner.nextLine();

                switch(decision) {
                    case "1":
                        // createAccount(BankAccount bank1);
                        bank1.generateCard();
                        System.out.println("Your card has been created");
                        System.out.println("Your card number:");
                        System.out.println(bank1.getCard());
                        bank1.generatePin();
                        System.out.println("Your card PIN:");
                        System.out.println(bank1.getPin() + "\n");

                        break;

                    case "2":
                        //loginAccount();
                        System.out.println("Enter your card number: ");
                        if(bank1.getCard().equals(scanner.nextLine())) {
                            System.out.println("Enter your pin: ");
                            if(bank1.getPin().equals(scanner.nextLine())) {
                                isLoggedIn = true;
                                System.out.println("You have successfully logged in!1\n");
                                while(flag && isLoggedIn) {

                                    System.out.println("1. Balance");
                                    System.out.println("2. Log out");
                                    System.out.println("0. Exit\n");

                                    decision = scanner.nextLine();

                                    // switch statement
                                    switch (decision) {
                                        case "1":
                                            // balance
                                            System.out.println("Balance: 0\n");
                                            break;

                                        case "2":
                                            // log out
                                            isLoggedIn = false;
                                            System.out.println("You are successfully logged out!\n");
                                            System.out.println("1. Create an account");
                                            System.out.println("2. Log into account");
                                            System.out.println("0. Exit\n");
                                            break;

                                        case "0":
                                            // exit
                                            System.out.println("Bye!\n");
                                            flag = false;
                                            break;
                                    }
                                }

                            }
                        } else {
                            System.out.println("Wrong card number or pin!\n");
                        }

                        break;

                    case "0":
                        System.out.println("Bye!\n");
                        flag = false;
                        break;
                }
            }
        }


    }
