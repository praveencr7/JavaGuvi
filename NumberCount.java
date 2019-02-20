import java.util.*;
 public class NumberCount
  {
   int num;
   int count=0;
   Scanner sc = new Scanner(System.in);
    void calculate()
     { 
       int n = sc.nextInt();
      while(n!=0){
       count++;
       n = n/10;
          }
System.out.println(count);
    }

public static void main(String[]args)
  {
    NumberCount obj = new NumberCount();
    obj.calculate();
}
}
