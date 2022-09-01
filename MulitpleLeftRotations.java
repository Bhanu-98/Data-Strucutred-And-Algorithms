public class MulitpleLeftRotations {
    public int[][] solve(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;

        int[][] output = new int[lenB][lenA];
        for(int i = 0; i < lenB; i++){
            int[] temp = A.clone();
            int b = B[i];
            b = b % lenA;
            temp = reverseArr(temp, lenA, 0, lenA - 1);
            temp = reverseArr(temp, lenA, 0,lenA - b - 1);
            temp = reverseArr(temp, lenA, lenA - b,  lenA - 1);
            output[i] = temp.clone();
        }
        return output;
    }

    public int[] reverseArr(int[] arr, int len, int p, int q){
        for(int i = p, j = q ; i < len && j > 0 ; i++, j--){
            if( i < j){
                swap(arr, i, j);
            }
            
        }   
        return arr;
    }

    public int[] swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
