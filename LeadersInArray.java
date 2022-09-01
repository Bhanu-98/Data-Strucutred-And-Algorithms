public class LeadersInArray {

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        int[] B = solve(A);
        PrintArray.printArray(B);

    }
    public static int[] solve(int[] A) {
        int count = 1;
        int N = A.length;
        int max = A[N - 1];
        
        for(int i = N - 2; i >= 0; i--){
            if(A[i] > max ){
                count = count + 1;
                max = A[i];
            }
        }

        int maxF = A[N - 1];
        int[] response = new int[count];
        response[count - 1] = A[N - 1];
        int j = 0;
        for(int i = N - 2; i >=0; i--){
             if(A[i] > maxF ){
                maxF = A[i];
                response[j] = maxF;
                j++;
            }
        }


        return response;
    }
}
