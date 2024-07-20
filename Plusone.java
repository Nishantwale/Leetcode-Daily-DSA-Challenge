import java.util.*;


class Plusone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do u want to enter?: ");
        int size = sc.nextInt();

        System.out.print("Enter "+size+" elements: ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        Solution s = new Solution();
        s.onePlus(arr);

        sc.close();
    }
}


class Solution{
    public int[] onePlus(int[] arr){

        int result [] = new int[arr.length];
        int carry = 1;
        for(int i=arr.length-1; i>=0; i--){
            int sum = arr[i] + carry;
            result[i] = sum %10;
            carry = sum / 10;
        }

        if (carry == 1) {
            int[] newResult = new int[arr.length + 1];
            newResult[0] = carry;
            for (int i = 0; i < arr.length; i++) {
                newResult[i + 1] = result[i];
            }
            result = newResult;
        }


        System.out.print("[ ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        System.out.print("]");
        
        
        
        
        return arr;

        
    }
}
