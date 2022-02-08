public class Task7 {
    //Составить программу вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
    //Результат представить в виде таблицы,
    //первый столбец которой – значения  аргумента,
    //второй - соответствующие значения функции:

    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double h = 0.1;
        System.out.printf("\t\t\tx\t\t\t\t\t\t y\n");
        for (double i = a; i <= b; i+=h){
            System.out.printf("\t\t%6.9f \t\t\t%6.9f\n", i, F(i));
        }
    }

    private static double F(double x){
        return Math.pow(Math.sin(x), 2) - Math.cos(2*x);
    }
}
