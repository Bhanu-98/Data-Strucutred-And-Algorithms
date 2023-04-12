import java.util.HashMap;

public class Tester {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("abcd", "bhanu");
        map.put("efgh", "prakash");
        
        ImmutableClass immutableClass = new ImmutableClass("bhanu", "abcd", map);
        
        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getData());
        
        
        // immutableClass.id = "3545";
        
        map.put("ijkl", "oleti");

        immutableClass.getData().put("fuhrg", "dkrrtg");
        System.out.println(immutableClass.getData());
    }
    
}
