import java.util.*;


public class SelfDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();
        int count;
        for(int i= left; i<=right; i++){
            int temp = i;
            count=0;
            int res = 0;
            while(temp!=0){
                int d = temp%10;
                if(d==0){
                    count = 1;
                }else{
                    count = i%d;
                }

                if(count == 0){
                    res ++;
                }
                
                temp = temp/10;
            }

            String c = Integer.toString(i);
            if(res == c.length()){
                System.out.print(i+" ");
            }
        }

        sc.close();
    }
}


