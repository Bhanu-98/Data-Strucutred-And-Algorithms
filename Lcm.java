import java.lang.*;
import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        for(int i = 0; i < cases; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int lcm = A * B;
            for(int j = 1; j <= lcm; j++ ){
                if(j > A && j > B){
                    if(j % A == 0){
                        if(j % B == 0){
                            if(j < lcm){
                                lcm = j;
                            }
                        }
                    }
                }
                
            }
            System.out.println(lcm);
        }
        
    }
}