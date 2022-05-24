import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
        
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
                if(a.size() == 1){
                    return a;
                }
                for(int i = 0; i < d; i++){
                    int index, firstElement;
                    firstElement = a.get(0);
                    for(index = 0; index < a.size() - 1; index++){
                        a.set(index, a.get(index + 1));
                    } 
                    a.set(index, firstElement);  
                }
                
                
                return a;
        }
}

