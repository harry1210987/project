import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanobj = new Scanner(System.in);
        int[] arr1 = new int[4];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter the number \t");
            arr1[i] = scanobj.nextInt();

        }
        
        scanobj.close();
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("you integer is \t\t" + arr1[i]);
        }
    }

}
