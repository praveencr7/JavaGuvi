 import java.util.*;
public class Fibanocii {
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  int limit = sc.nextInt();
	  int n1=0;
	  int n2=1;
	  int n3;
	  System.out.print(n1+""+n2);
	  for(int i=2;i<limit;i++){
	  n3=n2+n1;
	  System.out.print(n3);
	  n1=n2;
	  n2=n3;	  
  }
}
}
