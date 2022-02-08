public class Task6 {
    //Написать программу нахождения суммы большего и меньшего из трех чисел.

    public static void main(String[] args) {
        double x = Math.random();
        double y = Math.random();
        double z = Math.random();
        System.out.println("x=" + x + "\ny=" + y + "\nz=" + z +
                "\nSum(min+max)=" + (Math.min(Math.min(x,y),z) + Math.max(Math.max(x,y),z)));
    }
}
