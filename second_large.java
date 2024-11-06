import java.util.*;
public class second_larger {
    public static void main(String[]args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    sec=max;
                    max=arr[i];
            }
                else if(arr[i]>sec && arr[i]<max){
                    sec=arr[i];

            }


        }

        System.out.println(max);
        System.out.println(sec);
    }
}
