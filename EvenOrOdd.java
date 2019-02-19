import java.util.*;
 public class EvenOrOdd
  {
    Scanner sc  = new Scanner(System.in); 
    public void calculate()
      {
        int n = sc.nextInt();
            if(n%2==0){
               System.out.println("Even");           
                     }
                      else{
                        System.out.println("Odd");
                          }
     }
public static void main(String[]args){
     EvenOrOdd obj =new EvenOrOdd();
      obj.calculate();
     } 
}
