import java.util.*;


public class Twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int rest = s.dominantIndex(nums);
        System.out.println(rest);
        

        sc.close();
    }
}

class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int k=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                k = i;
            }
        }

        
        int count =0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]*2)<=max){
                count ++;
            }
        }


        if(count<nums.length && count==nums.length-1){
            return k;
        }else{
            return -1;
        }
    }
}
