import java.util.*;
public class IsNumeric {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] =s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>48 && ch[i]<57){
				System.out.println("yes");
				break;
			}
			else{
				System.out.println("no");
				break;
			}
			
		}
	}

}
