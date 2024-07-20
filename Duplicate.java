import java.util.*;


class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter "+size+" Elements: ");
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Entered Array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("After removing duplicates: ");
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                set.add(arr[i]);
            }
        }


        sc.close();
    }
}
