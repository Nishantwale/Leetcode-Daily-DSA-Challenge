import java.util.*;


class SQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sqrt = 0;
        
        while(sqrt*sqrt<=n){
            sqrt++;
        }
        System.out.println(sqrt-1);

        sc.close();
    }
}
