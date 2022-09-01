public class SuffixSumArray {
    public static void main(String[] args) {
        int[] A = {15, 10, 25, 5, 10, 20};
        int b = 3;
        int[] suffixSumArr = suffixSum(A);
        int[] preFixArr = EquilibriumIndex.preFixSum(A);
        for(int i = 0; i < A.length; i++){
            System.out.print(suffixSumArr[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < A.length; i++){
            System.out.print(preFixArr[i] + " ");
        }

    }

    private static int[] suffixSum(int[] arr) {
        int suffixArr[] = new int[arr.length];
        suffixArr[arr.length - 1] = arr[arr.length - 1];

        for( int a = arr.length - 2; a >= 0; a--){
            suffixArr[a] = suffixArr[a + 1] + arr[a];
        }
        return suffixArr;
    }
    
}
