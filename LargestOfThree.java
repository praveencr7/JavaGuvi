import java.util.*;
public class LargestOfThree
{
    Scanner sc= new Scanner(System.in);
    public void find()
    {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
    public static void main(String[]args)
    {
        LargestOfThree obj = new LargestOfThree();
        obj.find();
    }
}
