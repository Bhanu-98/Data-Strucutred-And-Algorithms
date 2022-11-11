import java.util.Stack;

public class BalanceParanthesis {

    public static void main(String[] args) {
        solve("()");
    }
    

    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        if(A.charAt(0) == ')'){
            return 0;
        }
        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else if(!stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
        }

        if(stack.size() == 0){
            return 1;
        } 

        return 0;
    }
}
