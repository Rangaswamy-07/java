import java.util.*;
public class selectionsort
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
		for(int i=0;i<arr.length-1;i++){
		    int m =i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j] < arr[m]) m=j;
		           
		        
		       
		    }
		   int temp =arr[i];
		           arr[i] = arr[m];
		           arr[m] = temp;
		        }
		
	
		
		for(int i=0;i<arr.length;i++){
		   System.out.print(arr[i]);
		}
		
	} 
}
