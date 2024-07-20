import java.util.*;



class Ugly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Solution s = new Solution();

        boolean result = s.isUgly(n);
        System.out.println(result);
        

        sc.close();
    }
    
}

class Solution {
    public boolean isUgly(int n) {
        int count;
        int p=0;
        
        for(int i=1; i<=n; i++){
            count = 0;
            for(int j=1; j<=i; j++){
                if((i%j==0 && n%i==0) && i<6){
                    count++;
                }
            }
            if(count == 2){
                p++;
            }
            

        }

        if(p==2){
            return true;
        }else{
            return false;
        }
    }
}
