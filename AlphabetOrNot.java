import java.util.*;
 public class AlphabetOrNot
  {
    Scanner sc = new Scanner(System.in);
     public void find()
      {
       char ch = sc.next().charAt(0);
         if(ch >='a' && ch<='z'){
              System.out.println("Alphabet");
                    }
                       else{
                         System.out.println("No");
                           }
           }
  public static void main(String[]args){
    AlphabetOrNot obj = new  AlphabetOrNot();
    obj.find();
}
}
