public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaabaaa"));
    }
    public static String longestPalindrome(String A) {
        int N = A.length();
        int ans = 0;
        String sub = "";
        for(int i = 0; i < N; i++){
            int p1 = i;
            int p2 = i;
            int tempAns = expand(A, p1, p2);
            if(tempAns > ans){
                ans = tempAns;
                sub = A.substring(p1 - 1, p2);
            }
        }
        for(int i = 0; i < N; i++){
            int p1 = i;
            int p2 = i + 1;
            int tempAns = expand(A, p1, p2);
            if(tempAns > ans){
                ans = tempAns;
                sub = A.substring(p1, p2 + 1);
            }
        }
        return sub;
    }

    private static int expand(String s, int p1, int p2){
        while(p1 > 0 && p2 < s.length() && (s.charAt(p1) == s.charAt(p2))){
            p1--;
            p2++;
        }
        return p2 - p1 - 1;
    }

}
