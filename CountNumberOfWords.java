import java.util.*;
public class CountNumberOfWords {
   public static void main(String[]args){
	   int count=1;
	   Scanner sc = new Scanner(System.in);
	   String s =sc.nextLine();
	    char[]ch =s.toCharArray(); 
	   for(int i=0;i<s.length();i++){
	   if(ch[i]==' '){
		   count++;
	   }
	   
   }
	   System.out.println(count);
}
}
