import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            int num = scanner.nextInt();
            if( num == 1){
                System.out.println("NO");
            }
            int sum = 0;
            for(int j = 1; j < num; j++){
                if(num % j == 0){
                    sum = sum + j;
                }
            }

            if( sum == num){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}
