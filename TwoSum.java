import java.util.*;


class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int [] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        Solution s = new Solution();
        int[] a = s.twoSum(nums, target);
        System.out.print("[ ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        

        sc.close();
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result[] = new int[2];
        int k=0;
        int l = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[k] = i;
                    result[l] = j;
                }
            }
        }

        return result;
    }
}
