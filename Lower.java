import java.util.*;
public class Lower{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution s1 = new Solution();
        String rest = s1.toLowerCase(s);
        System.out.println(rest);
        sc.close();
    }
}



class Solution {
    public String toLowerCase(String s) {
        String b = s.toLowerCase();
        return b;
    }
}