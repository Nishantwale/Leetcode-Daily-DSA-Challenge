import java.util.*;


class countprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        int n = sc.nextInt();
        
        Solution s = new Solution();

        int a = s.countPrimes(n);
        System.out.println(a);

        sc.close();
    }
}


class Solution {
    public int countPrimes(int n) {
        int count;
        int sum = 0;
        for(int i=1; i<n; i++){
            count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                sum++;
            }
        }

        return sum;
    }
}