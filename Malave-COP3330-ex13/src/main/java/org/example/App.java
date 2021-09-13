package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);

        System.out.println( "Enter the principal:" );
        String principleIn= sc.nextLine();

        System.out.println( "Enter the rate of interest:" );
        String interestIn = sc.nextLine();

        System.out.println( "Enter the number of years:" );
        String yearsIn = sc.nextLine();

        System.out.println( "What is the number of times the interest is compounded per year?" );
        String compoundIn = sc.nextLine();

        int P = Integer.parseInt(principleIn);
        double r = Double.parseDouble(interestIn);
        int t = Integer.parseInt(yearsIn);
        int n = Integer.parseInt(compoundIn);


        double base = (1 + ((r/100)/n));
        int exponent= (n*t);
        double pow= Math.pow(base,exponent);

        double A = (double)Math.round(P * (pow * 100))/100;

        System.out.println(" $" + P + " invested at " + r +"% for " + t +" years compounded " + n +" times per year is $" + A +".");
    }
}

