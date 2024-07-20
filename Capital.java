import java.util.*;



class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        Solution s = new Solution();
        boolean res = s.detectCapitalUse(word);
        System.out.println(res);
        
        sc.close();
    }
}

class Solution {
    public boolean detectCapitalUse(String word) {
        String n = word.toUpperCase();

        String k = word.toLowerCase();
        int count=0;

        for(int i=1; i<word.length(); i++){
            
            if(Character.isLowerCase(word.charAt(i))){
                count++;
            }

        }

        if((Character.isUpperCase(word.charAt(0))&&count==word.length()-1)){
            return true;
        }else if(n.equals(word)){
            return true;
        }else if(k.equals(word)){
            return true;
        }else{
            return false;
        }
    }
}