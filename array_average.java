import java.util.*;
public class average {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int arr[]=new int[num];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        for(int nums:arr){
         sum+=nums;
        }
        double average=(double)sum/arr.length;
        System.out.println(average);
    }
}
