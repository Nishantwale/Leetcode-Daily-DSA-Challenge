import java.util.*;


public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int prices[] = new int[size];
        for(int i=0; i<size; i++){
            prices[i] = sc.nextInt();
        }

        Solution s = new Solution();
        int ty = s.maxProfit(prices);
        System.out.println(ty);

        sc.close();
    }
}


class Solution {
    public int maxProfit(int[] prices) {
        
        int k=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]>prices[i]){
                    int profit = prices[j] - prices[i];
                    if(profit>k){
                        k = profit;
                    }
                }
            }
        }

        

        int fr = k;
        return fr;
    }
}