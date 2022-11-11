import java.util.Stack;

public class BalanceParanthesis2 {

    public static void main(String[] args) {
        String parenthsis = "({})";
        System.out.println(solve(parenthsis));
        // solve(parenthsis);
    }
    
    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        if(A.length() % 2 !=0){
            return 0;
        }
        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }
            
            if(ch == '}' && (!stack.isEmpty() && stack.peek() == '{')){
                stack.pop();
            }
            
            if(ch == ']' && (!stack.isEmpty() && stack.peek() == '[')){
                stack.pop();
            }
            
            if(ch == ')' && (!stack.isEmpty() && stack.peek() == '(')){
                stack.pop();
            }
        }
        
        if(stack.size() == 0){
            return 1;
        } else {
            return 0;
        }
    }
}

