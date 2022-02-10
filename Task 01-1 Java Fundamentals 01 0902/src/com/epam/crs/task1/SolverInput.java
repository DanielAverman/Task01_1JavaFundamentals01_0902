package com.epam.crs.task1;

import java.util.Scanner;

public class SolverInput {

    public static int getConsoleIntValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: the value is not an integer. Enter integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getConsoleDoubleValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: the value is not a double. Enter double: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int getConsoleEvenIntValue(){
        int result = getConsoleIntValue();
        while (result % 2 != 0){
            System.out.println("The integer has to be even");
            result = getConsoleIntValue();
        }
        return result;
    }
}
