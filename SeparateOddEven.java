import java.lang.*;
import java.util.*;

public class SeparateOddEven {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int j = 0; j < T; j++) {
            int len = scanner.nextInt();
            int arr[] = new int[len];
            
            int oddCount = 0;
            int evenCount = 0;
            for (int i = 0; i < len; i++) {
                arr[i] = scanner.nextInt();
                // System.out.println(arr[i]);
                if(Math.abs(arr[i]) % 2 == 0){
                    evenCount = evenCount+1;
                } else {
                    oddCount = oddCount+1;
                }               
            }


            // System.out.println("Even count : " + evenCount);
            // System.out.println("Odd Count: " + oddCount);

            int[] evenArr = new int[evenCount];
            int[] oddArr = new int[oddCount];

            int a = 0, b = 0;
            // int k = 0;

            for(int k = 0; k < len; k++){
                if(arr[k] % 2 == 0){
                    evenArr[a] = arr[k];
                    a++;
                } else {
                    oddArr[b] = arr[k];
                    b++;
                }
            }

            // while(k++ < len){
                
            // }

            System.out.println("Even size: " + evenArr.length);
            System.out.println("Odd size: " + oddArr.length);

            for(int p = 0; p < evenArr.length; p++){
                System.out.print(evenArr[p] + " ");
            }

            System.out.println();

            for(int l = 0; l < oddArr.length; l++){
                System.out.print(oddArr[l] + " ");
            }
            
        }
        
    }
}