public class LongestPalindrome {
    public String longestPalindrome(String A) {
        int maxLength = 0;
        String subStr = "";
        for(int i = 0; i < A.length(); i++){
            int len = 0;
            for(int j = i; j < A.length(); j++){
                String subString = A.substring(i, j + 1);
                boolean isPalin = Palindrome.isPalin(subString);
                if(isPalin){
                    len = subString.length();
                    if(len > maxLength){
                        maxLength = len;
                        subStr = subString;
                    }
                }
            }
        }
        return subStr;
    }
}
