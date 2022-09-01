
public class TimeToEqualityIncrement {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int time = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }

        for(int i = 0; i < A.length; i++){
            if(A[i] != max){
                time = time + (max - A[i]);
            }
        }

        

        return time;
    }
}
