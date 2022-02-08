public class Task5 {
    //Даны три действительных числа.
    //Возвести в квадрат те из них, значения которых неотрицательны,
    //и в четвертую степень — отрицательные.

    public static void main(String[] args) {
        double x = Math.random()*10-15;
        double y = Math.random()*10-7;
        double z = Math.random()*10-2;
        if (x >= 0) {
            System.out.println("x = " + x + " >= 0 => " + x*x);
        } else {
            System.out.println("x = " + x + " < 0 => " + Math.pow(x, 4));
        }
        if (y >= 0) {
            System.out.println("y = " + y + " >= 0 => " + y*y);
        } else {
            System.out.println("y = " + y + " < 0 => " + Math.pow(y, 4));
        }
        if (z >= 0) {
            System.out.println("z = " + z + " >= 0 => " + z*z);
        } else {
            System.out.println("z = " + z + " < 0 => " + Math.pow(z, 4));
        }
    }
}
