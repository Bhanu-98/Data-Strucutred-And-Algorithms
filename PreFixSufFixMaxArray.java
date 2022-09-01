public class PreFixSufFixMaxArray {

    public static void main(String[] args) {
        int[] A = {1, 2, 0, 3, 5, 2, 1, 7, 3};
        int[] pre = preFix(A);
        int[] suf = sufFix(A);

        for(int i = 0; i < A.length; i++){
            System.out.print(pre[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < A.length; i++){
            System.out.print(suf[i] + " ");
        }
    }
    

    public static int[] preFix(int[] A){
        int[] preFix = new int[A.length];
        preFix[0] = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] > preFix[i - 1]){
                preFix[i] = A[i];
            } else {
                preFix[i] = preFix[i - 1];
            }
        }
        return preFix;
    }

    public static int[] sufFix(int[] A){
        int[] suffixArr = new int[A.length];
        suffixArr[A.length - 1] = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > suffixArr[i + 1]){
                suffixArr[i] = A[i];
            } else {
                suffixArr[i] = suffixArr[i + 1];
            }
        }
        return suffixArr;
    }
}
