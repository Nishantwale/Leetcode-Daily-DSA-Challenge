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
        int t[] = s.sortArrayByParity(nums);

        for(int i=0; i<t.length; i++){
            System.out.print(t[i]+" ");
        }
    }
}





class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int abc[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                abc[k] = nums[i];
                k++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                abc[k] = nums[i];
                k++;
            }
        }

        return abc;
    }
}
