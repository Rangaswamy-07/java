import java.util.*;
public class bubblesort
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
		    for(int j=0;j<arr.length-1-i;j++){
		        if(arr[j] > arr[j+1]){
		           int temp =arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1] = temp;
		        }
		        
		       
		    }
		   
		
	
		}
		for(int i=0;i<arr.length;i++){
		   System.out.print(arr[i]);
		}
		
	} 
}
