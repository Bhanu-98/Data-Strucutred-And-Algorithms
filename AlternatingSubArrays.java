import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatingSubArrays {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 0, 1, 0, 1);
        solve(A, 1);
    }
    public static ArrayList<Integer> solve(List<Integer> A, int B) {
        int N = A.size();
        int K = 2 * B + 1;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i <= N - K; i++){
            int start = i;
            int end = i + K - 1;
            boolean isAlternate = true;

            while(start < end){
                if(A.get(start) == A.get(start + 1) || A.get(end) == A.get(end - 1) || A.get(start) != A.get(end)){
                    isAlternate = false;
                    break;
                }
                start++;
                end--;
            }
            if(isAlternate){
                int center = ( start + end ) / 2 ;
                res.add(center);
            }
        }
        return res;
    }
}
