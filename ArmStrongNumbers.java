import java.lang.*;
import java.util.*;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        for(int i = 1; i <=range; i++ ){
            // split i
            int num = i;
            int sum = 0;
            while(num > 0){
                int digit = num % 10;
                num = num/10;
                sum = sum + (digit * digit * digit);
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}