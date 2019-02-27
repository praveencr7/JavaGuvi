import java.util.*;
 public class Power
  {
   Scanner sc =new Scanner(System.in);
    public void calculate()
     {
      int num =sc.nextInt();
      int exp =sc.nextInt();
      int result =1;
      while(exp!=0)
       {
          result = result*num;
          exp--;
       }
       System.out.println(result);
 }
public static void main(String[]args)
 {
   Power obj = new Power();
   obj.calculate();
 }
}
