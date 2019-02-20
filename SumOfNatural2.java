import java.util.*;
public class SumOfNatural1
{
    Scanner sc =new Scanner(System.in);
    int j = 0;
    public void Natural()
    {
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            j = j+i;
        }
        System.out.println(j);
    }
    public static void main(String[]args)
    {
        SumOfNatural1 obj = new SumOfNatural1();
        obj.Natural();
    }
}
