public class Task10 {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public static void main(String[] args) {
        int n = 6;
        int[][] template = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                template[i][j] = (i % 2 == 0)? j+1 : n-j;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(template[i][j] + " ");
            }
            System.out.println();
        }
    }
}
