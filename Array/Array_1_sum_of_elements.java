import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 values into array : ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Total sum of the array is :"+ sum);
    }
}
