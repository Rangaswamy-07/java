import java.util.*;
public class insertion
{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("enter the array size: ");
		int size = sc.nextInt();
		System.out.print("enter the elements: ");
		int [] arr =new int[size];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i=1;i<arr.length;i++){
		    int key =arr[i];
		    int j=i-1;
		   while((j>=0)&&(arr[j]>key)){
		       arr[j+1] =arr[j];
		       j-=1;
		   }
		   arr[j+1] = key;
		}
		for(int i=0;i<arr.length;i++){
		   System.out.print(arr[i]);
		}
		
	} 
}
