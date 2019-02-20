import java.util.*;
public class LeapYear{
    Scanner sc = new Scanner(System.in);
    int n;
    public void calculate()
    {
        n= sc.nextInt();
        if(n%4==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[]args)
    {
        LeapYear obj = new LeapYear();
        obj.calculate();
    }
}
