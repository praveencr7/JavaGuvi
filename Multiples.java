import java.util.*;
public class Multiples {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int result=1;
    public void calculate(){
        for(int i=1;i<=n;i++){
            result = n*i;
            System.out.println(result);
        }
    }
    public static void main(String []args){
        Multiples obj = new Multiples();
        obj.calculate();
    }
}
