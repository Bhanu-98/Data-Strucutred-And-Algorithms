import java.util.HashMap;
import java.util.Map.Entry;

public final class ImmutableClass {
    private final String name;
    private final String id;
    private final HashMap<String, String> data;
    
    public ImmutableClass(String name, String id, HashMap<String, String> map) {
        this.id = id;
        this.name = name;
        
        HashMap<String, String> dMap = new HashMap<>();
        for(Entry<String, String> entry : map.entrySet()){
            dMap.put(entry.getKey(), entry.getValue());
        }
        
        this.data = dMap;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public HashMap<String, String> getData(){
        HashMap<String, String> map = new HashMap<>();
        for(Entry<String, String> entry : this.data.entrySet()){
            map.put(entry.getKey(), entry.getValue());
        }
        
        return map;
    }
    
    
    
}
