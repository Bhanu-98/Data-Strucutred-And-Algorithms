public class MergeSortDesc {
     public static void main(String[] args) {
         int[] intArray = {20, -10, 11, 35, 23, 55, 78};
         mergeSort(intArray, 0, intArray.length);

     }

     public static void mergeSort(int[] input, int start, int end){
         if(end - start < 2){
             return; // all sub arrays are one element sized elements
         }
        

    
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        
        merge(input, start, mid, end);

     }

     public static void merge(int[] input, int start, int mid, int end){

        if(input[mid -1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

     }
}