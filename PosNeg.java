import java.util.*;
public class PosNeg {
 Scanner sc = new Scanner(System.in);
 public void calculate(){
  int n = sc.nextInt();
     if(n<0){
       System.out.println("negative");
        }
          else if(n==0){
            System.out.println("zero");
               }
                 else{
                   System.out.println("positive");
                        }
}
 public static void main(String[]args)
   {
     PosNeg obj = new PosNeg();
     obj.calculate();
   }
}

