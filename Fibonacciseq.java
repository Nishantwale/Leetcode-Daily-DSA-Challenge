import java.util.*;

class Fibonacciseq{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution s = new Solution();
        int b = s.fib(n);
        System.out.println(b);
        sc.close();
    }
}


class Solution {
    public int fib(int n) {
        int arr[] = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        
        int result = 0;
        if(n==0){
            result = arr[0];
        }else if(n==1){
            result = arr[1];
        }else{
            result = arr[n-1] + arr[n-2];
        }
        return result;
    }
}