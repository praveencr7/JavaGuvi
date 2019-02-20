import java. util.*;
public class ArrayGuvi
{
    public static void main(String[]args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<K;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
