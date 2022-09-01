public class MaxSumArraySum {
    public static void main(String[] args) {
        int[] A = {  2, 9, 5};
        System.out.println(subarraySum(A));
    }


    public static long subarraySum(int[] A) {
        int preFixArr[] = preFixSum(A);
        long maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            for(int j = i; j < A.length; j++){
                long sum = 0;
                if(i == 0){
                    sum = preFixArr[j];
                } else {
                    sum = preFixArr[j] - preFixArr[i - 1];
                }  

                if(sum > maxSum){
                    maxSum = sum;
                } 
            }
        }

        return maxSum;
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
