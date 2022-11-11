public class PowerFunction {
    public static void main(String[] args) {
        pow(2, 3, 5);
    }
    
    public static int pow(int A, int B, int C){
        if(A == 0){
            return 0;
        }
        
        if(B == 0){
            return 1;
        }
        
        
        long p = (long)pow(A, B/2, C);
        if(B % 2 == 0) {
            return (int)((p%C * p%C)+C) % C;
        }else{
            return (int)((A%C * p%C * p%C)+C) % C;
        }
    }
    
}
