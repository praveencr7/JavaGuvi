import java.util.*;
public class ArrayWithIndex {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            arr2[i]=i;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+arr2[i]);
        }
    }
}
