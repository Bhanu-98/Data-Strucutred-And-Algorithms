import java.util.Arrays;
import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] A = {1, 8, 2, 8, 8, 8, 8, 4, 4, 6, 10, 10, 9, 2, 9, 3, 7};
        System.out.println(pairSum(A, 1));
    }

    public static int pairSum(int[] arr, int diff){
        int p1 = 0;
        int p2 = 1;
        int arrayLength = arr.length;
        HashSet<String> set = new HashSet<>();
        Arrays.sort(arr);
        int numberOfPairs = 0;
        while (p1 < arrayLength && p2 < arrayLength) {
            int currentDiff = arr[p2] - arr[p1];
            if (currentDiff > diff) {
                p1++;
            } else if (currentDiff < diff) {
                p2++;
            } else {
                String s = arr[p1] + " " + arr[p2];
                if (!set.contains(s)) {
                    set.add(s);
                    numberOfPairs++;
                }
                p1++;
                p2++;
            }
        }
        return numberOfPairs;
    }
}
