public class NonDecreasingSubArrays {
    public static void main(String[] args) {
        int[] A = { 7, 7, 1, 6, 9};
        int[][] B = {  {1, 3}, {4, 5}, {1, 2} , {3, 4}, {1, 5} };
        int a[] = solve(A, B);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int[] solve(int[] A, int[][] B) {

        int[] output = new int[B.length];
        for(int i = 0; i < B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            boolean response = true;
            int sum = 0;
            for(int j = left - 1; j <= right; j++){

                if(j != 0 && j < A.length){
                    if(A[j] < A[j - 1]){
                        response = false; 
                    }   
                }
                
            }

            if(response){
                output[i] = 1;
            } else {
                output[i] = 0;
            }
        }

        return output;
    }
}
