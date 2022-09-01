import java.lang.*;
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        // Taking Inputs
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        System.out.print(T);
        for (int j = 0; j < T; j++) {
            System.out.println("Enter Array:");
            int len = scanner.nextInt();
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int b = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < len; i++) {
                if (arr[i] == b) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? 1 : 0);
        }
    }
    
}