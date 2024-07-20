import java.util.*;


class Newrev {
    public static void main(String[] args) {
        int size1,size2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the First Array: ");
        size1 = sc.nextInt();

        System.out.print("Enter the Size of the Second Array: ");
        size2 = sc.nextInt();


        System.out.print("Enter "+size1+" Elements of First Array: ");
        int arr1[] = new int[size1];

        

        for(int i=0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter "+size2+" Elements of Second Array: ");
        int arr2[] = new int[size2];

        
        for(int i=0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }

        int result[] = new int[Math.max(size1,size2)+1];
        int k = 0;
        int carry = 0;
        for(int i=arr1.length-1; i>=0; i--){
            for(int j=arr2.length-1; j>=0; j--){
                if(i==j){
                    int sum = arr1[i] + arr2[j] + carry;
                    result[k] = sum%10;
                    carry = sum/10; 
                    k++;
                }
            }
        }

        result[result.length - 1] = carry;



        System.out.print("The Addition of Two array is : ");
        boolean leadingZero = true;

        for(int i=result.length-1; i>=0; i--){

            if(result[i]==0 && leadingZero){
                continue;
            }
            leadingZero = false;
            System.out.print(result[i]+" ");
        }

        sc.close();

    }
}
