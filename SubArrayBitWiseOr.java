public class SubArrayBitWiseOr {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0};
        solve(A.length, A);
    }

    public static long solve(int A, int[] B) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < A; i++){
            if(B[i] == 1){
                count = count + ((A - i) * (i + 1));
            }
        }

        return count;
    }
}
