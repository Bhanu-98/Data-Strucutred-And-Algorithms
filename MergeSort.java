import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(6, 1, 4, 10, 2, 1, 5);
        mergeSort(A, 0, A.size() - 1);
        System.out.println(A);


    }

    private static void mergeSort(List<Integer> A, int s, int e) {
        if(s == e){
            return;
        }

        int mid = (s + e) / 2;
        mergeSort(A, s, mid);
        mergeSort(A, mid + 1, e);
        merge(A, s, mid, e);
    }

    private static void merge(List<Integer> A, int s, int m, int e) {
        List<Integer> temp = new ArrayList<>();
        int p1 = s;
        int p2 = m + 1;
        while(p1 <= m && p2 <= e){
            if(A.get(p1) < A.get(p2)){
                temp.add(A.get(p1));
                p1++;
            } else {
                temp.add(A.get(p2));
                p2++;
            }
        }

        while(p1 <= m){
            temp.add(A.get(p1));
            p1++;
        }

        while(p2 < e + 1){
            temp.add(A.get(p2));
            p2++;
        }

        for(int i = s; i <= e; i++){
            A.set(i, temp.get(i - s));
        }
    }

    
}
