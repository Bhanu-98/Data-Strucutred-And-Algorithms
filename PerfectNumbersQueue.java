import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.management.Query;

public class PerfectNumbersQueue {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    public static String solve(int A){
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast("1");
        dq.addLast("2");
        ArrayList<String> series = new ArrayList<>();
        for(int i = 1; i <= A; i++){
           StringBuilder sb = new StringBuilder();
            String temp = dq.peekFirst();
            String temp1 = sb.append(temp).reverse().toString();
            dq.removeFirst();
             String x = temp+"1";
            String y = temp+"2";
            dq.addLast(x);
            dq.addLast(y);
            series.add(temp+temp1);
            sb.delete(0,sb.length()+1);
        }
        return series.get(series.size()-1);
    }
}
