import java.util.*;


class Len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int length =0;
        boolean word = false;
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch!=' '){
                length++;
                word = true;
            }else if(word){
                break;
            }
        }

        System.out.print("The Length of Last Word is: "+length);

        sc.close();
    }
}
