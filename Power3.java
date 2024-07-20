import java.util.*;




class Power3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Solution s = new Solution();

        boolean a = s.isPowerOfThree(n);
        System.out.println(a);
        sc.close();
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        double sq = 0;
        int count =0;
        for(int i=0; i<n; i++){
            sq = Math.pow(3, i);
            if(sq==n){
                count++;
                break;
            }
        }

        if(count == 1){
            return true;
        }else{
            return false;
        }
    }
}
