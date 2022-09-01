public class ArrayRowSum {
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = {9, 2, 3, 4};
        int[][] A = {a, b, c};
        solve(A);
    }

    public static int[] solve(int[][] A) {
        int[] rowSumArr = new int[A.length];

        for(int i = 0; i < A.length; i++){
            int j = 0;
            int sum = 0;
            while(j < A[0].length){
                sum = sum + A[i][j];
                // rowSumArr[i] =  sum; 
                j++;
                
            }
            System.out.println(sum);
            
            
            
        }

        return rowSumArr;
    }
}
