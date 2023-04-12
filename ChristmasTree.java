public class ChristmasTree {
    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        int[] B = {1, -4, 3};
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int[] B) {
        int N = A.length;
        int minimumSum = Integer.MAX_VALUE;

        for(int i = 1; i < N; i++){
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            for(int j = 0; j < i; j++){
                if(A[j] < A[i] && B[j] < left){
                    left = B[j];
                }                
            }

            for(int k = i + 1; k < N; k++){
                if(A[k] > A[i] && B[k] < right){
                    right = B[k];
                }
            }

            if(left != Integer.MAX_VALUE && right != Integer.MAX_VALUE){
                int sum = B[i] + left + right;
                minimumSum = Math.min(sum, minimumSum);
            } 

        }
        return minimumSum == Integer.MAX_VALUE ? -1 : minimumSum;
    }

}
