public class AmazingSubArrays {
    public class Solution {
        public int solve(String A) {
            int result = 0;
            int len = A.length();
            for(int i = 0; i < len; i++){
                // char b = A.charAt(i);
                char ch = A.charAt(i);
                if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
    result +=len-i; 
    result%=10003;
    }
                
               
            }
    
            return result % 10003;
        }
    }
    
}
