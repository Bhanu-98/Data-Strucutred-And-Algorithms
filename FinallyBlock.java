public class FinallyBlock {

    public static void main(String[] args) {
       System.out.println(runMethod());
    }


    public static String runMethod(){
        try{
            throw new Exception("Hello Exception");
        } catch (Exception ex){
            ex.printStackTrace();
            return "Hello"; 
        } finally{
            System.out.println("Executed finally block");
        }
    }
    
}
