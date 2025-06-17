import java.util.*;
public class binarysearch
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
		int i=0;
		int j=arr.length-1;
		while(i<=j){
		int mid = (i+j)/2;
		if(arr[mid] == n){
		    System.out.println("index at :" +mid);
		}
		else if(arr[i] < n) i=mid+1;
		else if(arr[j] > n) j =mid;
	
		}
		System.out.println("not found");
	} 
}
