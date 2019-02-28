import java.util.*;
public class Odd {
    Scanner sc = new Scanner(System.in);
    public void calculate()
    {
        int first = sc.nextInt();
        int last = sc.nextInt();
        for(int i=first+1;i<last;i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        Odd obj = new Odd();
        obj.calculate();
    }
}
