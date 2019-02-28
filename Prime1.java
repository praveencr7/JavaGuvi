import java.util.*;
public class Prime1 {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count =0;
    public void calculate()
    {
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[]args){
        Prime1 obj =new Prime1();
        obj.calculate();
    }
}
