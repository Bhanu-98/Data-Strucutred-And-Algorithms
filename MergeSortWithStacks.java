import java.util.Stack;

public class MergeSortWithStacks {

    public static void main(String[] args) {
        int[] A = {66, 96, 43, 28, 14, 1, 41, 76, 70, 81, 22, 11, 42, 78, 4, 88, 70, 43, 90, 6, 12};
        PrintArray.printArray(solve(A));
    }
    public static int[] solve(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < A.length; i++){
            stack.push(A[i]);
        }

        Stack<Integer> ans = sort(stack);
        return reverse(ans);
    }


     public static int[] reverse(Stack<Integer> s)
    {
        int[] rev = new int[s.size()];
        int i = 0;
        while(!s.empty())
        {
            rev[i] = s.peek();
            i++;
            s.pop();
        }
        return rev;
    }

    private static Stack<Integer> sort(Stack<Integer> stack){
        if(stack.size() <= 1){
            return stack;
        }
        Stack<Integer> stack2 = new Stack<>();
        for(int i = 0; i < stack.size() / 2; i++){
            int ele = stack.peek();
            stack2.push(ele);
            stack.pop();
        }

        Stack<Integer> a = sort(stack);
        Stack<Integer> b = sort(stack2);
        return mergeStack(a, b);
        
    }

    private static Stack<Integer> mergeStack(Stack<Integer> s1, Stack<Integer> s2){
        Stack<Integer> s3 = new Stack<Integer>();
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek() >= s2.peek()){
                s3.push(s2.peek());
                s2.pop();
            } else {
                s3.push(s1.peek());
                s1.pop();
            }
        }

        while(!s1.isEmpty()){
            s3.push(s1.peek());
            s1.pop();
        }

        while(!s2.isEmpty()){
            s3.push(s2.peek());
            s2.pop();
        }

        return s3;
    }

}
