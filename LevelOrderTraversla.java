import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}
public class LevelOrderTraversla {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(12);
        treeNode.right = new TreeNode(6);
        treeNode.left.right = new TreeNode(-9);
        treeNode.right.left = new TreeNode(-1);
        treeNode.right.left.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(10);
        treeNode.right.right.left = new TreeNode(9);
        treeNode.right.right.left.right = new TreeNode(19);
        levelOrder(treeNode);
    }
    
    
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        queue.add(null);
        while(queue.size() > 1){
            TreeNode temp = queue.poll();
            if(temp == null){
                queue.add(temp);
                res.add(tempList);
                tempList = new ArrayList<>();
            } else {
                tempList.add(temp.val);
                if(temp.left !=  null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        res.add(tempList);
        return res;
    }
}