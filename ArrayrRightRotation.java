import java.util.List;

public class ArrayrRightRotation {
    public static int[] rotate(int[] nums, int k) {
        int n=nums.length;
        if(k > n) 
            k=k%n;
        nums=reverse(nums, 0, n-1);
        nums=reverse(nums, 0, k-1);
        nums=reverse(nums, k, n-1);
        return nums;        
    }
    
    public static int[] reverse(int[] nums, int start, int end) {
       while (start <= end ) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums; 
    }
    
    public static void main(String[] args)
    {
        
        int[] nums = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int k = 13;
        int[] nums2 = rotate(nums, k);
        for(int i : nums2){
            System.out.print(i);
            System.out.print(" ");

        }
    }
}

