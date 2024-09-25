import java.util.*;

public class RevWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        Solution s2 = new Solution();

        String abc = s2.reverseWords(s);
        System.out.println(abc);

        sc.close();
    }
}

class Solution {
    public String reverseWords(String s) {
        char h = ' ';
        String ab = Character.toString(h);
        s = s + ab;
        String nishant = "";
        char tp = ' ';
        String hj = "";
        int count = 0;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char c = s.charAt(i+1);

            if(ch!=' '&&c==' '){
                count++;
            }
        }
        String bc = "";
        String cd = "";
        int j = 0;
        int k = 0;
        String arr[] = new String[count];
        int y=0;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            char c = s.charAt(i+1);
            j = s.length()-2;
            k = s.length()-1;
            if(ch==' '&&c==' '){
                continue;
            }else if(ch==' '&&c!=' '){
                if(bc!=""){
                    arr[y] = cd;
                    y++;
                }
                bc = "";
                cd = "";
            }else{
                bc = Character.toString(ch);
                cd = cd + bc;
                if(s.charAt(j)!=' '){
                    arr[y] = cd;
                }
            }
            
            
        }

        if(s.charAt(j)==' '&&s.charAt(k)==' '){
            arr[y] = cd;
            y++;
        }

        

        for(int i=arr.length-1; i>=0; i--){
            nishant = nishant + arr[i];
            if(i!=0){
                hj = Character.toString(tp);
                nishant = nishant + hj;
            }
        }

        return nishant;
    }
}
