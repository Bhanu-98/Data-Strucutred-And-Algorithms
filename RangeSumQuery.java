public class RangeSumQuery {
    public static void main(String[] args) {
        int[] A = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int[][] B = { {7, 10}, {3, 10}, {3, 5},{1, 10} };
        long[] C = rangeSum(A, B);
        for(int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }

    }

    public static long[] rangeSum(int[] A, int[][] B) {

        int[] preFixArr = preFixSum(A);
        long[] sumArr = new long[B.length];
        for(int i = 0; i < B.length; i++){
            int[] query = B[i];
            int left = query[0] - 1; // to handle 1-indexed
            int right = query[1] - 1; //to handle 1-indexed
            long sum = 0;
            if(left == 0){
                sum = preFixArr[right];
            } else {
                sum = preFixArr[right] - preFixArr[left - 1];
            }
            sumArr[i] = sum;
        }

        return sumArr;
    }

    public static int[] preFixSum(int[] arr) {
        int preFixArr[] = new int[arr.length];
        preFixArr[0] = arr[0];

        for( int a = 1; a < arr.length; a++){
            preFixArr[a] = preFixArr[a - 1] + arr[a];
        }
        return preFixArr;
    }

    
}
