public class AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(addBinary("110", "101"));
    }
    
    public static String addBinary(String A, String B) {
        int numA = 0;
        int numB = 0;
        for(int i = B.length() - 1; i >= 0; i--){
            int val = Character.getNumericValue(B.charAt(i));
            if(val!=0){
                numB = numB + (int) Math.pow(2, A.length() - i - 1);
            }
        }

        for(int i = A.length() - 1; i >= 0; i--){
            int val = Character.getNumericValue(A.charAt(i));
            if(val!=0){
                numA = numA + (int) Math.pow(2, A.length() - i - 1);
            }
        }

        Integer res = numA + numB;
        
        return Integer.toBinaryString(res);
    }
}
