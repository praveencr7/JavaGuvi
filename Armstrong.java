import java.util.*;
public class Armstrong {
    Scanner sc =new Scanner(System.in);
    int num =sc.nextInt();
    int temp = num;
    int last;
    int cube;
    int sum=0;
    int n=2;
    public void calculate() {
            while (num > 0) {
                last = num % 10;
                cube = last * last * last;
                sum = sum + cube;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    public static void main(String []args){
        Armstrong obj = new Armstrong();
        obj.calculate();
    }
}
