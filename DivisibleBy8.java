public class DivisibleBy8 {
    
    public static void main(String[] args) {
        System.out.println(solve("4758310052942341036336679074241759053154797537802772"));
    }

    public static int solve(String A) {
        // test Line
        if(A.length() == 1){
            if(A.equals("8")){ 
                return 1;
            } else if(A.equals("0")) {
                return 1;
            } else{
                return 0;
            }
        }
        int length = A.length();
        String last2Digits = String.valueOf(A.charAt(length - 2))+ String.valueOf(A.charAt(length - 1));

        if(Integer.parseInt(last2Digits) % 8 == 0){
            return 1;
        }

        return 0;
        
    }
}
