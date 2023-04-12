import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxAndMinInSubArrayWindow {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(-1);
        list.add(7);
        list.add(-3);
        list.add(-1);
        list.add(-2);
        System.out.println(solve(list, 4));

    }


    public static int solve(ArrayList<Integer> A, int B) {

        Deque<Integer> dq = new LinkedList<>();
        Deque<Integer> dq2 = new LinkedList<>();

        int mod = 1000 * 1000 * 1000 + 7;

        for(int i = 0; i < B; i++){

            while(dq.size() > 0 && A.get(dq.peekLast()) <= A.get(i)){
                dq.pollLast();
            }

            while(dq2.size() > 0 && A.get(dq2.peekLast()) >= A.get(i)){
                dq2.pollLast();
            }

            dq.offerLast(i);
            dq2.offerLast(i);

        }

        long sum = A.get(dq.peekFirst()) + A.get(dq2.peekFirst());

        for(int i = B; i < A.size(); i++){

            while(dq.size() > 0 && A.get(dq.peekLast()) <= A.get(i)){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(dq.peekFirst() == i - B){
                dq.pollFirst();
            }
            
            while(dq2.size() > 0 && A.get(dq2.peekLast()) >= A.get(i)){
                dq2.pollLast();
            }

            dq2.offerLast(i);

            if(dq2.peekFirst() ==i - B){
                dq2.pollFirst();
            }

            sum += A.get(dq.peekFirst()) + A.get(dq2.peekFirst());
            sum %= mod;
        }
        sum = sum + mod;
        sum = sum % mod;
        return (int) sum;
    }
}