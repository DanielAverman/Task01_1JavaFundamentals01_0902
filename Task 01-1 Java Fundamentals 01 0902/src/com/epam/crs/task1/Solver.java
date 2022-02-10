package com.epam.crs.task1;

public class Solver {

    public static void main(String[] args) {
        processIsFirst2DigitsEqualLast();
        processFindMinPlusMax();
        processCreateTemplateMatrix();
    }

    private static void processIsFirst2DigitsEqualLast(){
        int number = SolverInput.getConsoleIntValue();
        boolean result = SolverLogic.isFirst2DigitsEqualLast(number);
        SolverView.printBoolean(number, result);
    }

    private static void processFindMinPlusMax(){
        double x = SolverInput.getConsoleDoubleValue();
        double y = SolverInput.getConsoleDoubleValue();
        double z = SolverInput.getConsoleDoubleValue();
        double sum = SolverLogic.findMinPlusMax(x, y, z);
        SolverView.printMinPlusMax(x, y, z, sum);
    }

    private static void processCreateTemplateMatrix(){
        int n = SolverInput.getConsoleEvenIntValue();
        int[][] templateMatrix = SolverLogic.createTemplateMatrix(n);
        SolverView.printTemplateMatrix(templateMatrix);
    }
}
