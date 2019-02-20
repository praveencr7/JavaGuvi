import java.util.*;
public class Hello1
{
    Scanner sc = new Scanner(System.in);
    public void calculate(){
        int n = sc.nextInt();
        while(n>0){
            System.out.println("Hello");
            n--;
        }
    }
    public static void main(String[]args)
    {
        Hello1 obj = new Hello1();
        obj.calculate();
    }
}
