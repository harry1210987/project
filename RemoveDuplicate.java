import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        RemoveDuplicate m1 = new RemoveDuplicate();
        ArrayList<Integer> ans = m1.solveCode(arr);
        System.out.println(ans);

    }

    public  ArrayList<Integer> solveCode(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                list.add(arr[j]);
                i++;
            }
        }

        return list;
    }
}