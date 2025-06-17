import java.util.Stack;
public class Stackinteger
{
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		System.out.println("delete a element : " +st.pop());
		System.out.println("peek a element : " +st.peek());
	}
}
