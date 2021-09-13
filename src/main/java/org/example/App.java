/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first_number = scan.nextInt();

        System.out.print("Enter the second number: ");
        int second_number = scan.nextInt();

        System.out.print("Enter the third number: ");
        int third_number = scan.nextInt();

        if(first_number == second_number && first_number == third_number)
        {
            System.out.println("The numbers are the same.");
            System.exit(0);
        }

        if(first_number >= second_number && first_number >= third_number)
        {
            System.out.println("The largest number is " + first_number);
        }
        else if (second_number >= first_number && second_number >= third_number)
        {
            System.out.println("The largest number is " + second_number);
        }
        else
        {
            System.out.println("The largest number is " + third_number);
        }
    }
}
