public class Task2 {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения)

    public static void main(String[] args) {
        double a = 1.1;
        double b = 2.1;
        double c = 3.1;
        double result = (b + Math.sqrt(b*b+4*a*c))/(2*a) - Math.pow(a,3)*c+Math.pow(b, -2);
        System.out.println("Result = " + result);
    }
}
