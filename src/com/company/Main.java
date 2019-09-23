package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Her skriver vi ud til konsollen

        // Dit navn
        System.out.println("Hvad er dit navn");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        // Første tal
        System.out.println("Hvad er dit første tal");
        int a = input.nextInt();
        // Andet tal
        System.out.println("Hvad er dit andet tal");
        int b = input.nextInt();

        // Hvordan skkal tallene behandles?
        System.out.println("Hvad skal der ske med tallene?");
        String operator =

        // -, +, * eller /
        //System.out.println("Hvad skal der ske med tallene?");
        //float f = input.nextFloat();

        input.close();

        System.out.println("Hej " +username+ " dit tal er" + " " +(a+b));


        // er to Strings ens? password.equals(username)));
        // er to tal ens? (a == b));

    }
}
