import java.util.*;
public class MaximumInArray {
public static void main(String[]args){
	Scanner sc =new Scanner(System.in); 
	int N = sc.nextInt();
	int arr[] = new int[N];
	int max = arr[0];
	for(int i=0;i<N;i++){
		arr[i] = sc.nextInt();
	}
		for(int j=0;j<N;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
		System.out.println(max);
	}

	
}

