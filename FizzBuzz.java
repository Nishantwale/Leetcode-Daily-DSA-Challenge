import java.util.*;


public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        Solution s = new Solution();
        s.fizzBuzz(n);

        sc.close();
    }
}
class Solution {
    public List<String> fizzBuzz(int n) {
        String arr[] = new String[n];
        int k = 0;
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                arr[k] = "FizzBuzz";
            }else if(i%5==0){
                arr[k] = "Buzz";
            }else if(i%3==0){
                arr[k] = "Fizz";
            }else{
                arr[k] = ""+i;
            }
            k++;
        }

        return Arrays.asList(arr);
        
        
    }
}