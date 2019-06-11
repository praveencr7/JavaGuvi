import java.util.*;
public class Time {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min  = sc.nextInt();
		int hour1 = sc.nextInt();
		int min1  = sc.nextInt();
		int result = Math.abs(hour-hour1);
		int result1 = Math.abs(min-min1);
		System.out.println(result+" "+result1);
	}

}
