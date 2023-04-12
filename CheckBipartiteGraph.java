import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class CheckBipartiteGraph {
    
    public static void main(String[] args) {
        List<List<Integer>> B = new ArrayList<>();
        B.add(Arrays.asList(2, 5));
        B.add(Arrays.asList(6, 7));
        B.add(Arrays.asList(4,8));
        B.add(Arrays.asList(2, 3));
        B.add(Arrays.asList(0, 3));
        B.add(Arrays.asList(4, 7));
        B.add(Arrays.asList(1, 8));
        B.add(Arrays.asList(3, 8));
        B.add(Arrays.asList(1, 3));
        System.out.println(solve(9, B)); 
        
    }
    
    public static int solve(int A, List<List<Integer>> B) {
        ArrayList<Integer>[] adjList = new ArrayList[A + 1];
        
        for(int i = 0; i < adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }
        for(int i = 0; i < B.size(); i++){
            adjList[B.get(i).get(0)].add(B.get(i).get(1));
            adjList[B.get(i).get(1)].add(B.get(i).get(0));
        }
        
        int[] c = new int[A + 1];
        for(int i = 0; i < A; i++){
            if(c[i] == 0){
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while(!queue.isEmpty()){
                    int u = queue.poll();
                    int cu = c[u];
                    for(int j = 0; j < adjList[u].size(); j++){
                        int v = adjList[u].get(j);
                        if(c[v] == 0){
                            c[v] = 3 - cu;
                            queue.add(v);
                        } else if(c[v] == c[u]){
                            return 0;
                        }
                    }
                }
            }
            
        }
        
        
        return 1;
    }
}
