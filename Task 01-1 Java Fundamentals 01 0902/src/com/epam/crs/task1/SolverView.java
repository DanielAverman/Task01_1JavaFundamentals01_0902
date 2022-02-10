package com.epam.crs.task1;

public class SolverView {

    public static void printBoolean(int number, boolean output){
        System.out.println("First 2 digits of number " + number + " equal last 2 digits is " + output);
    }

    public static void printMinPlusMax(double x, double y, double z, double sum){
        System.out.println("x=" + x + "\ny=" + y + "\nz=" + z +
                "\nSum(min+max)=" + sum);
    }
    public static void printTemplateMatrix(int[][] template){
        System.out.println("The template matrix for " + template.length + " looks:");
        for (int[] ints : template) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
