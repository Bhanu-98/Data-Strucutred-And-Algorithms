import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] A = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(A));
    }


    public static int longestConsecutive(final int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < A.length; i++){
            hs.add(A[i]);
        }
        for(Integer x : hs){
            if(!hs.contains(x - 1)){
                int count = 1;
                int y = x + 1;
                while(hs.contains(y)){
                    y++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
