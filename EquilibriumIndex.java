public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] preFixArr = preFixSum(A);
        for(int i = 0; i < A.length; i++){
            System.out.print(preFixArr[i] + " ");
        }
        // System.out.println(solve(A));
    }
    public  static int solve(int[] A) {
        int[] preFixArray = preFixSum(A);
        int index = -1;
        for(int i = 0; i < A.length; i++){
            int left = 0;
            if( i != 0){
                left = findValueInPreFix(preFixArray, i - 1);
                System.out.println("Pre Fix for i: " + i + " is " + left);
            } 
            int right = findValueInPreFix(preFixArray, A.length - 1) - findValueInPreFix(preFixArray, i);
        
            if(left == right){
                index = i;
            }
        }
        return index;

    }


    public static int[] preFixSum(int[] arr) {
        int preFixArr[] = new int[arr.length];
        preFixArr[0] = arr[0];

        for( int a = 1; a < arr.length; a++){
            preFixArr[a] = preFixArr[a - 1] + arr[a];
        }
        return preFixArr;
    }

     private static int findValueInPreFix(int[] arr, int i){
        if (i == 0){
            return arr[0];
        }

        int preFixI = 0;
        preFixI = findValueInPreFix(arr, i  - 1) + arr[i];
        return preFixI;
    }
}
