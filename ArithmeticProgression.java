import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int[] A = {3, 5, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        Arrays.sort(A);
        
        if(A.length < 2){
            return 0;
        }

        int cdiff = A[1] - A[0];
        for(int i = 1; i < A.length; i++){
            int diff = Math.abs(A[i - 1] - A[i]);
            if(!(diff == cdiff)){
                return 0;
            }
        }

       return 1;
    }
}
