import java.util.*;


class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        int a = s.missingNumber(nums);
        System.out.println(a);
        

        sc.close();
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        
        int result = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                result = i;
                break;
            }else if(nums.length-1==i){
                result = i+1;
            }
        }
        
        return result;
    }
}