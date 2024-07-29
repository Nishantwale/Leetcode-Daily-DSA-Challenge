import java.util.*;

public class FreakArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int [] arr = s.frequencySort(nums);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        


        sc.close();
    }
}


class Solution {
    public int[] frequencySort(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        

        int result[] = new int[nums.length];
        int k = 1;
        result[0] = nums[0];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>i; j--){
                if(nums[i]!=nums[j]){
                    result[k] = nums[j];
                    k++;
                }
            }
        }
        int count = 0;
        for(int i=0; i<result.length; i++){
            if(result[i]==0){
                count++;
            }
        }
        int redy[] = new int[result.length-count];
        int s = 0;
        for(int i=0; i<result.length; i++){
            if(result[i]!=0){
                redy[s] = result[i];
                s++;
            }
        }

        

        int af[] = new int[redy.length];
        int p;
        for(int i=0; i<redy.length; i++){
            p = 0;
            for(int j=0; j<nums.length; j++){
                if(redy[i]==nums[j]){
                    p++;
                    af[i] = p;
                    
                }
            }
        }


        for(int i=0; i<af.length; i++){
            for(int j=i+1; j<af.length; j++){
                if(af[i]>af[j]){
                    int temp2 = af[j];
                    af[j] = af[i];
                    af[i] = temp2;
                }
            }
        }

        


        int tks[] = new int[af.length];
        int q = 1;
        tks[0] = af[0];
        for(int i=0; i<af.length-1; i++){
            for(int j=i+1; j>i; j--){
                if(af[i]!=af[j]){
                    tks[q] = af[j];
                    q++;
                }
            }
        }
        int frd = 0;
        for(int i=0; i<tks.length; i++){
            if(tks[i]==0){
                frd++;
            }
        }
        int atm[] = new int[tks.length-frd];
        int d = 0;
        for(int i=0; i<tks.length; i++){
            if(tks[i]!=0){
                atm[d] = tks[i];
                d++;
            }
        }

        
        
        

        int abc;
        int nishant[] = new int[nums.length];
        int nw = 0;
        int tmp=0;
        for(int i=0; i<atm.length; i++){
            for(int j=0; j<nums.length; j++){
                abc = 0;
                for(int l=0; l<nums.length; l++){
                    if(nums[j]==nums[l]){
                        abc++;
                    }
                }
                if(atm[i]==abc){
                    nishant[nw] = nums[j];
                    nw++;
                }
            }
            for(int r=tmp;r<nw;r++){
                for(int r1=r+1;r1<nw;r1++){
                    int tmp1=nishant[r1];
                    nishant[r1]=nishant[r];
                    nishant[r]=tmp1;
                    
                }
                tmp++;
            }

            
        }

        return nishant;
    }
}
