package com.rajat.GeneralIssues;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : " );
        String name = scanner.nextLine();
        System.out.println("Enter your year of Birth : ");
        String age = scanner.nextLine();
        scanner.close();
        System.out.println("Your name : " + name + " Age : " + age);
    }
}
