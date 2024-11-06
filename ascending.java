import java.util.*;
public class ascending {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        int temp = 0;
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
