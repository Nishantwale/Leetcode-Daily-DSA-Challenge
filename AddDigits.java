import java.util.*;


class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Solution s = new Solution();

        int a = s.addDigits(num);
        System.out.println(a);

        sc.close();
    }
}


class Solution {
    public int addDigits(int num) {
        int temp;
        int result=num;
        int k=0;
        int val;
        int check=2;
        while(check>1){
            temp = result;
            k=0;
            val=0;
            while(temp>0){
                int d = temp%10;
                result = d + k;
                k = result;
                temp = temp/10;
                val++;
            }
            check = val;
            
        }

        return result;
    }
}
