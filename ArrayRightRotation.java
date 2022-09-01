import java.util.*;

public class ArrayRightRotation {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        // Taking Inputs
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int len = 0;
        String[] strArr = line.split(" ");
        len = Integer.parseInt(strArr[0]);
        int arr[] = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(strArr[i + 1]);
        }

        int b = scanner.nextInt();

        for(int i = 0, j = len - 1 ; i < len && j > 0 ; i++, j--){
            swap(arr, arr[i], arr[j]);
        }

        for(int k = 0; k < len; k++){
            System.out.println(arr[k]);
        }

       



        
        
    }

    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}