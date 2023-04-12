import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Koccurances {
    
    public static void main(String[] args) {
        System.out.println(getSum(4, 4, Arrays.asList(2, 2, 2, 2)));
        
    }
    
    
    public static int getSum(int A, int B, List<Integer> C) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < C.size(); i++){
            hashMap.put(C.get(i), hashMap.getOrDefault(C.get(i), 0) + 1);
        }

        int sum = 0;
        int mod = 1000000007;
        boolean found = false;
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int i = 0; i < C.size(); i++){
            if(hashMap.containsKey(C.get(i)) && hashMap.get(C.get(i)) == B){
                count++;
                hs.add(C.get(i));
            }
        }
        if(count < 1){
            return -1;
        }

       java.util.Iterator<Integer> itr = hs.iterator();
        while(itr.hasNext()){
            sum = sum + itr.next();
        }
        return sum % mod;
    }
}

