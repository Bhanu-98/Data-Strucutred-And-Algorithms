import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<int[]> res = splitArray(arr, 2);

        // output should be [[1, 2], [3, 4], [5, 6]]
        // number of chunk arrays = arr.length / k - smallest integer that is greater than or equal 
        // 6 / 2 = 3
        // 5 / 2 = 2.5 => 3
        // example [1, 2, 3, 4, 5] => [[1, 2, 3], [4, 5]]

    }

    public static List<int[]> splitArray(int[] array, int k){
        
        List<int[]> chunks = new ArrayList<>();
        int chunkCount = (int) Math.ceil((double) array.length / k);
    
        for (int i = 0; i < chunkCount; i++) {
          int start = i * k;
          int end = Math.min((i + 1) * k, array.length);
          int[] chunk = Arrays.copyOfRange(array, start, end);
          chunks.add(chunk);
        }
    
        return chunks;
    }
}
