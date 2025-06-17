import java.util.*;
public class reverse
{
	public static void main(String[] args) {
		Stack st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    st.push(ch);
		}
		String b="";
		for(int i=0;i<s.length();i++){
		    b+=st.pop();
		}
		System.out.print(b);
	
	}
}
