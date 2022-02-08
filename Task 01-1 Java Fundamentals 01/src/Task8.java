public class Task8 {
    //В массив A [N] занесены натуральные числа.
    //Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {
        int[] A = {3, 5, 12, 123, 1234, 3232, 324, 2};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] % k == 0) {
                sum += A[i];
            }
        }
        System.out.println("Sum (mod " + k + ") = " + sum);
    }
}
