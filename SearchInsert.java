import java.util.*;


class SearchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int nums[] = new int[size];

        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        int target;
        target = sc.nextInt();

        Solution s = new Solution();
        int rest = s.searchInsert(nums, target);
        System.out.println(rest);
        

        sc.close();
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int b = nums.length-1;
        int c = nums.length;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                count = i;
                break;
            }else if(target>nums[b]){
                count = c;
                break;
            }else if(target>nums[i]&&target<nums[i+1]){
                count = i+1;
                break;
            }else if(target<nums[i]){
                count = i;
                break;
            }
        }
        return count;
    }
}

