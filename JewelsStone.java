import java.util.*;

public class JewelsStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jewels = sc.next();
        String stones = sc.next();

        Solution s = new Solution();

        int result = s.numJewelsInStones(jewels, stones);
        System.out.println(result);

        

        sc.close();
    }
}

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;

        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                char ch = jewels.charAt(i);
                char c = stones.charAt(j);

                String a = Character.toString(ch);
                String b = Character.toString(c);

                if(a.equals(b)){
                    count++;
                }
            }
        }

        return count;
    }
}