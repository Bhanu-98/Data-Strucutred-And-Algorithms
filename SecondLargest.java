public class SecondLargest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,5};
        int b = solve(a);
        System.out.println(b);
    }
    public static int solve(int[] A) {
        int maxValue = Integer.MIN_VALUE;
        int secondValue = Integer.MIN_VALUE;

        if(A.length < 2){
            return -1;
        }
        int maxIndex = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > maxValue){
                maxValue = A[i];
                maxIndex = i;
            } 
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] != maxValue){
                if(secondValue > A[i]){
                    secondValue = A[i];
                }
            } 
        }

        // System.out.println(secondValue);


        return secondValue == Integer.MIN_VALUE ? -1 : secondValue;
    }
}
