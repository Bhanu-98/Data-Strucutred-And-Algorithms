import java.lang.*;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for( int i = 2; i < num; i++){
            if(num % i == 0){
                count = count + 1;
            }
        }
        
        if(count > 0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }   
        
    }
}