import java.util.*;
public class Palindrome{
    Scanner sc = new Scanner(System.in);
    int sum =0;
    int last;
    int i = 3;
    public void find() {

            int num=sc.nextInt();
            int temp = num;
            while (num > 0) {
                last = num % 10;
                sum = (sum * 10) + last;
                num /= 10;
            }
            if (sum == temp) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }

        }
public static void main(String[]args){
        Palindrome obj =new Palindrome();
        obj.find();
    }
}