public class Task9 {
    //Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    //Объединить их в один массив,
    //включив второй массив между k-м и (k+1) - м элементами первого.

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int k = 7;
        if (k < 0 || k >= A.length-1) {
            System.out.println("Array A has no index K or K+1. There is no place for second array.");
            return;
        }
        int[] mergedArray = new int[A.length + B.length];
        for (int i = 0, j = 0; i < A.length; i++){
            mergedArray[i+j] = A[i];
            if (i == k){
                for (;j < B.length; j++){
                    mergedArray[i+j+1] = B[j];
                }
            }
        }
        for (int i = 0; i < mergedArray.length; i++){
            System.out.println("Merged array["+i+"]=" +mergedArray[i]);
        }
    }
}
