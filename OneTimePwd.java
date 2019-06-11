import java.util.*;
public class OneTimePwd {
  public static void main(String[]args){
	  Scanner sc = new Scanner (System.in);
	  int count=0;
	  int sum2=0;
	  String fourth="";
	  String sixth="";
	  String otp;
	  System.out.println("enter account holder name");
	  String name = sc.nextLine();
	  if(name.length()>2){
		  System.out.println("valid");
	  }
	  else{
		  System.out.println("name should be more than 2 char");
	  }
	  System.out.println("enter account type");
	  String AccountType = sc.nextLine();
	  if(AccountType.equals("Savings")||AccountType.equals("Current")||AccountType.equals("Loan")){
		  System.out.println("valid");
	  }
	  else{
		  System.out.println("enter a valid account type");
	  }
	  System.out.println("enter account number");
	  long number =sc.nextLong();
	  //System.out.println(number);
	  long copy = number;
	  long last;
	  while(number>0){
		  last=number%10;
		  count++;
		  number=number/10;
	  }
	  if(count==11){
		  System.out.println("valid");
	  }
	  else{
		  System.out.println("11 numbers needed");
	  }
	  String Upto2 = AccountType.substring(0,2);
	  String s1 = String.valueOf(copy);
	  //System.out.println(s1);
	  String Third = s1.substring(0,1);
	  int sum1=0;
	 for(int i=0;i<5;i++){
		 sum1 +=Integer.parseInt(String.valueOf(s1.charAt(i)));
		  	         
	 }
	  fourth+=String.valueOf(((sum1/10)+(sum1%10)));
	  String fifth = name.substring(0,1);
	  for(int i=5;i<10;i++){
			 sum2+=Integer.parseInt(String.valueOf(s1.charAt(i)));  	         
		 }
	  //System.out.println(sum1);
	   sixth+=String.valueOf(((sum2/10)+(sum2%10)));
	   String seventh = name.substring(name.length()-1);
	   String eight=s1.substring(s1.length()-1);
	   otp=Upto2+Third+fourth+fifth+sixth+seventh+eight;
	   System.out.println(otp);
  }
  
}
	
