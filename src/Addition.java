import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element ");
            arr[i] = sc.nextInt();

        }
        sc.close();
       int num = 0;
        for(int j = 0; j < arr.length; j++){
             num = num + arr[j];

        }
        System.out.println("your answer is "+num);
    }
}
