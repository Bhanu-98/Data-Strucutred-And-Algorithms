public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalin("aaabaaa"));
        String str = "aaaabaaa";
        int maxLength = 0;
        for(int i = 0; i < str.length(); i++){
            int len = 0;
            for(int j = i; j < str.length(); j++){
                String subString = str.substring(i, j + 1);
                boolean isPalin = isPalin(subString);
                if(isPalin){
                    len = subString.length();
                    if(len > maxLength){
                        maxLength = len;
                    }
                }

            }
        }
        System.out.println(maxLength);
    }

    protected static boolean isPalin(String str){
        boolean isPalin = true;
        for(int i = 0; i < str.length() / 2; i++){
            if(!(str.charAt(i) == str.charAt(str.length() - i - 1))){
                isPalin = false;
            }
        }
        return isPalin;
    }
    
}
