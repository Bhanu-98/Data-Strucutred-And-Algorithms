public class CoutingValleys {

    public static void main(String[] args) {
        System.out.println(countingValleys(10, "UDUUUDUDDD"));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
            int insideValley =0;
            int seaLevel = 0;
            for(int i = 0; i < steps; i++){
                
                if(path.charAt(i) == 'U'){
                    seaLevel++;
                }
                
                if(path.charAt(i) == 'D'){
                    seaLevel--;
                }
                
                if(seaLevel == 0 && path.charAt(i) == 'U'){
                    insideValley++;
                }
            }
            
            return insideValley;
        }
    
}
