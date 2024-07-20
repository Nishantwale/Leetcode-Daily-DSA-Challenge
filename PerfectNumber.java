import java.util.*;

public class PerfectNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Solution s = new Solution();
        boolean k = s.checkPerfectNumber(num);
        System.out.println(k);
        sc.close();
    }
}


class Solution {
    public boolean checkPerfectNumber(int num) {
        int h=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                h = i+h;
            }
        }

        if(h==num){
            return true;
        }else{
            return false;
        }
    }
}