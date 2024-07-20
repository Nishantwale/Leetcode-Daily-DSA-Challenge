import java.util.*;


class single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int [size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

       Solution s = new Solution();
       int a = s.singleNumber(nums);
       System.out.println(a);
       sc.close();
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int count;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count == 1){
                result = nums[i];
            }
            
            
        }

        return result;
    }
}
