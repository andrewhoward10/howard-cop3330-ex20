/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double order, tax;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        order = keyboardInput.nextDouble();

        System.out.print("What state do you live in: ");
        String state = keyboardInput.next();

        System.out.print("What county do you live in: ");
        String county = keyboardInput.next();

        if(state.equals("Wisconsin")){
            tax = order * 0.05;
            System.out.println("The subtotal is $" + String.format("%.2f", order) + "\n" + "The tax is $" + String.format("%.2f", tax) +  "\n" + "The total is $" + String.format("%.2f", tax +order)  );
        }
        else if (county.equals("Eau Claire")){
            tax = order * .055;
        System.out.println(" The tax is $" + String.format("%.2f", tax ) +  "\n" + "The total is $" + String.format("%.2f", tax +order)  );
    }
        else if (county.equals("Dunn")){
            tax = order * .054;
            System.out.println("The tax is $" + String.format("%.2f", tax) +  "\n" + "The total is $" + String.format("%.2f", tax +order)  );
        }
        else if (state.equals("Illinois")){
        tax = order * 0.08;
        System.out.println("The subtotal is $" + String.format("%.2f", order) + "\n" + "The tax is $" + String.format("%.2f", tax) +  "\n" + "The total is $" + String.format("%.2f", tax +order)  );

    }
        else {
        tax = 0;
        System.out.println("The subtotal is $" + String.format("%.2f", order) + "\n" + "The tax is $" + String.format("%.2f", tax) +  "\n" + "The total is $" + String.format("%.2f", tax +order)  );
    }


    }
}
