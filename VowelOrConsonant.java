import java.util.*;
  public class VowelOrConsonant{
    Scanner sc = new Scanner(System.in);
      public void calculate()
        {
          char ch = sc.next().charAt(0);
             if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch =='u'){
                System.out.println("Vowel");
                      }
                       else{
                            System.out.println("Consonant");
                            }
         }
   public static void main(String[]args){
    VowelOrConsonant obj = new VowelOrConsonant();
    obj.calculate();
 }
}
