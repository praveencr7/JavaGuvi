import java.util.*;
public class SumOfNatural
{
    Scanner sc =new Scanner(System.in);
    int j = 0;
    public void Natural()
    {
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            j = i+1;
        }
        System.out.println(j);
    }
    public static void main(String[]args)
    {
        SumOfNatural obj = new SumOfNatural();
        obj.Natural();
    }
}
