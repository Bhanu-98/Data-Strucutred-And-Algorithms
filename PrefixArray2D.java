public class PrefixArray2D {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] preFixArray = preFix2D(A);
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(preFixArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] preFix2D(int[][] A){
        int[][] preFixArray = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(i == 0 && j == 0){
                    preFixArray[i][j] = A[i][j];
                }

                if(i == 0 && j > 0){
                    preFixArray[i][j] = preFixArray[i][j - 1] + A[i][j];
                }

                if(i > 0 && j == 0){
                    preFixArray[i][j] = preFixArray[i - 1][j] + A[i][j];
                }

                if(i > 0 && j > 0){
                    preFixArray[i][j] = preFixArray[i - 1][j] + preFixArray[i][j - 1] - preFixArray[i - 1][j - 1] + A[i][j];
                }
            }
        }
        return preFixArray;
    }
}
