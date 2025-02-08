//check whether the ascending order or not if not fixed it 
public class YourWorld {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 7, 4, 9 };
        int count = 0;
        int[] arr1 = new int[6];
        for (int i = 0; i < arr.length; i++) { // for copying the array to print the original input at the end

            arr1[i] = arr[i];
        }

        for (int i = 1; i < arr.length; i++) { // check whether the ascending order or not depending how much mistakes are there
            if (arr[i] < arr[i - 1]) {
                count++;

            }

        }

        if (count == 0) {
            System.out.println("the array is in the ascending order ");

        }

        else {

            for (int i = 1; i < arr.length; i++) {      //for swapping the values within the array if the next element of the array is the larger 
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }

            }

            System.out.println("your input was");       //middle statement 

            for (int i = 0; i < arr.length; i++) { // for printing the input

                System.out.print(arr1[i] + "\t");
            }

            System.out.println();
            System.out.println("your final answer  will be");       //middle statement 

            for (int i = 0; i < arr.length; i++) { // for the printing the output
                System.out.print(arr[i] + "\t");
            }

        }

    }
}