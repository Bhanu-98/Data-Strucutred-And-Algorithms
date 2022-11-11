public class BinarySearch {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int index = binarySearch(A, 10, 0, A.length - 1);
        System.out.println(index);
    }
    
    private static int binarySearch(int[] A, int k, int l, int r){
        int index = Integer.MIN_VALUE;
        
        while(l <= r){
           int mid = (l + r) / 2;
            if(A[mid] == k){
                index = mid;
                r = mid - 1;
            }
            
            if(A[mid] > k){
                // discard right
                // search left side
                r = mid - 1;
            } else if(A[mid] < k){
                // discard left
                // search right
                l = mid + 1;
            }
        }
        return index;
    }
}
