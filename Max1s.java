public class Max1s {
    public static void main(String[] args) {

    int[][] A = { {0, 0, 1, 1, 1}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 1, 1}};
    System.out.println(solve(A));
    }

    public static int solve(int[][] A) {
        int index = 0;
        int max = 0;
        for(int i = 0; i < A.length; i++){
            int[] arr = A[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 1){
                    count = count + 1;
                }
            }
            System.out.println("Row count:  " + count);
            System.out.println("Max Count: " + max);
            if(count > max){
                max = count;
                index = i;
            }
        }

        return index;
    }
}