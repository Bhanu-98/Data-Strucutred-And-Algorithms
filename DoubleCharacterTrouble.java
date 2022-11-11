import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        System.out.println(solve("abca"));
    }

    public static String solve(String A) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            } else {
                stack.push(A.charAt(i));
            }
        }

        if(stack.size() == 0){
            return "";
        }
        String s = "";
        while(!stack.isEmpty()){
            s = s + stack.peek();
            stack.pop();
        }
        return s;
    }
}
