import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        int[] A = {7, 1, 3, 4, 1, 7};
        solve(A);
    }

    public static void solve(int[] A) {
        HashMap<Integer, List<Integer>> hMap = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            List<Integer> list = hMap.get(A[i]);
            if(list!=null){
                list.add(i);
                hMap.put(A[i], list);
            } else {
                list = new ArrayList<>();
                list.add(i);
                hMap.put(A[i], list);
            }
        }
        System.out.println(hMap);
    }
    
}
