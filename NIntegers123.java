import java.util.ArrayDeque;
import java.util.Deque;

public class NIntegers123 {
    public static void main(String[] args) {
        
    }

    public static int[] solve(int A) {
        int[] out = new int[A];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        int i =0;
        while(A > 0){
            int pop = dq.remove();
            out[i] = pop;
            for(int j = 1; j <= 3; j++){
                dq.add((pop * 10) + j);
            }
            i++;
        }
        return out;
    }
}
