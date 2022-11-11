import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    public static void main(String[] args) {
        int[] A = {4, 6, 8, 10};
        int[] B = solve(A);
        for(int i = 0; i < A.length; i++){
            System.out.println(B[i]);
        }
    }

    public static int[] solve(int[] A) {
        
        Comparator<Integer> sort = new Comparator() {
            @Override
            public int compare(Object a, Object b){
                int x = (int) a;
                int y = (int) b;
                int fact1 = 0;
                int fact2 = 0;
                for(int i = 2; i < Math.sqrt(x); i++){
                    if(x % i == 0){
                        fact1 += 2;
                        if(i == x){
                            fact1--;
                        }
                    }
                }

                for(int i = 2; i < Math.sqrt(y); i++){
                    if(y % i == 0){
                        fact2 += 2;
                        if(i == y){
                            fact2--;
                        }
                    }
                }

                if(fact1==fact2){
                    return x-y;
                }
                    return fact1-fact2;
                }
        };

        Integer[] A1 = new Integer[A.length];
        for(int i=0;i<A.length;i++){
            A1[i]=A[i];
        }
        Arrays.sort(A1,sort);
        
        // Converting back from Integer[] → int[]
        for(int i=0;i<A.length;i++) {
            A[i]=A1[i];
        }
        return A;
    }
}