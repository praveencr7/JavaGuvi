import java.util.*;
public class NumberOfLines {
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  int count=1;
	  String s = sc.nextLine();
	  char ch [] =s.toCharArray();
	  for(int i=0;i<ch.length;i++){
		  if(ch[i]==('.')){
			  count++;
		  }
	  }
	  System.out.println(count);
  }
}
