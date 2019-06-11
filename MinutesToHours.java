import java.util.*;
public class MinutesToHours {
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  int Minutes = sc.nextInt();
	  int Min = Minutes%60;
	  int Hours = Minutes/60;
	  System.out.print(Hours);
	  System.out.print(" "+Min);
	  
  }
}
