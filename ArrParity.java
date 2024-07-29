import java.util.*;


public class ArrParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String strs[] = new String[size];

        for(int i=0; i<size; i++){
            strs[i] = sc.next();
        }

        Solution s1 = new Solution();
        String pr = s1.longestCommonPrefix(strs);
        System.out.println("\"" + pr + "\"");

        sc.close();
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count;
        String s = strs[0];
        int k = 0;
        for(int i=0; i<s.length(); i++){
            count = 0;
            for(int j=1; j<strs.length; j++){
                String d = strs[j];
                char ch = s.charAt(i);

                if(i>=d.length()){
                    break;
                }else if(ch==d.charAt(i)){
                    count ++;
                }
                
            }
            if(count==strs.length-1){
                k++;
            }else{
                break;
            }
        }
        String prefix = "";
        String jk = "";
        for(int i=0; i<k; i++){
            char c = s.charAt(i);
            jk = Character.toString(c);
            prefix = prefix + jk;
        }


        return prefix;
    }
}
