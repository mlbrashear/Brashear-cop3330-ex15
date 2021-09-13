package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        String username, password, password2;
        Scanner sc = new Scanner(System.in);

        //scan user input
        System.out.println("Create a username:");
        username = sc.nextLine();
        System.out.println("Create a password:");
        password = sc.nextLine();

        System.out.println("What is the password?");
        password2 = sc.nextLine();

        //compare the two passwords
        if(password.compareTo(password2) == 0)
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

        sc.close();
    }
}