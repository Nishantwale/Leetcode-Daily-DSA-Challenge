import java.util.*;
public class buddyString{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        
        Solution sty = new Solution();
        boolean fine = sty.buddyStrings(s, goal);
        System.out.println(fine);
        
        
        
        sc.close();
    }
}

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int size = s.length();
        int size2 = goal.length();
        String sk[] = new String[size];
        String srt[] = new String[size2];
        String nk ="";
        String g = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            nk = Character.toString(ch);
            sk[i] = nk;
        }

        for(int i=0; i<goal.length(); i++){
            char ch2 = goal.charAt(i);
            g = Character.toString(ch2);
            srt[i] = g;
        }

        
        
        for(int i=0; i<sk.length; i++){
            for(int j=i; j<=i; j++){
                if(sk[i]!=srt[j]){
                    sk[i] = srt[j];
                }
            }
        }

        String check = "";
        for(int i=0; i<sk.length; i++){
            check = check + sk[i];
        }

        if(check.equals(goal)){
            return true;
        }else{
            return false;
        }
        }
}
