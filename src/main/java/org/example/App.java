package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        int stringLength;
        String string;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");
        string = input.nextLine();

        if(string.equals(""))
        {
            System.out.println("You must enter something into the program");
        }
        stringLength = string.length();
        System.out.println(string + " has " + stringLength + " characters");
    }
}
