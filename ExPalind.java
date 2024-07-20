import java.util.*;
public class ExPalind{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution s = new Solution();
        boolean result = s.isPalindrome(x);
        System.out.println(result);
        sc.close();
    }
}





class Solution {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        String binary = "";

        for(int i=a.length()-1; i>=0; i--){
            char c = a.charAt(i);
            binary = binary + c;
        }

        if(binary.equals(a)){
            return true;
        }else{
            return false;
        }
    }
}