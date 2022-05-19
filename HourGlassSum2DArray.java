import java.util.List;

public class HourGlassSum2DArray {
    public static void main(String[] args) {

    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        // maxValue is set to -63 because that is the minimum number an int can take in java, if hour glass values are in negative it cannot go lesser than -63
        int maxSum = -63;
        for (int i = 0; i < arr.size(); i++) {
            if (i + 2 > arr.size() - 1) {
                break;
            }
            for (int j = 0; j < arr.size(); j++) {
                if (j + 2 > arr.size() - 1) {
                    break;
                }
                int hourGlassSum = 0;
                int firstRow = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int secondRow = arr.get(i + 1).get(j + 1);
                int thirdRow = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                hourGlassSum = firstRow + secondRow + thirdRow;
                if (hourGlassSum > maxSum) {
                    maxSum = hourGlassSum;
                }

            }
        }
        return maxSum;
    }

}