import java.util.*;
public class MyClass{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int nums[] = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int abc[] = s.sortedSquares(nums);

        for(int i=0; i<abc.length; i++){
            System.out.print(abc[i]+" ");
        }
    }
}




class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            nums[i] = Math.abs(temp*temp);
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }

        return nums;
    }
}
