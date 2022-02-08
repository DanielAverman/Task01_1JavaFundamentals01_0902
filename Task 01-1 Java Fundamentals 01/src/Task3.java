public class Task3 {
    //Вычислить периметр и площадь прямоугольного треугольника
    //по длинам а и b  двух катетов.

    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        System.out.println("Perimeter = " + (a+b+Math.sqrt(a*a+b*b)));
        System.out.println("Square = " + (a*b)/2);
    }
}
