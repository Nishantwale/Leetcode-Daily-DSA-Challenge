import java.util.*;

public class TilingProblem {
    public int tileProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int a = tileProblem(n-1);
        int b = tileProblem(n-2);

        int total = a + b;
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TilingProblem t = new TilingProblem();
        int result = t.tileProblem(n);
        System.out.println(result);
        sc.close();
    }
}
