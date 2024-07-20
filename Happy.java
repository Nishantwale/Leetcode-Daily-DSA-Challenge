import java.util.*;



class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Solution s = new Solution();
        boolean a = s.isHappy(n);
        System.out.println(a);


        sc.close();
    }
}


class Solution{
    public boolean isHappy(int n){

        
        int temp;
        int result = n;
        int k = 0;
        while(result!=1 && result!=4){
            temp = result;
            k = 0;
            while(temp>0){
                int d = temp % 10;
                result = k + (d*d);
                k = result;
                temp = temp/10;
            }
        }

        if(result == 1){
            return true;
        }else{
            return false;
        }

        
    }
}
