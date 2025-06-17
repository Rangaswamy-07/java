import java.util.*;
public class linearsearch
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
		System.out.print("find the element : ");
		int n = sc.nextInt();
		for(int i =0;i<arr.length;i++){
		    if(arr[i] == n){
		        System.out.println("index at: "+i);
		        System.exit(0);
		    }
		   
		}
		 System.out.println("not found");
	} 
}
