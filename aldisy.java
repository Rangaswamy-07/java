import java.util.*;
public class aldisy
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char ch = sc.next().charAt(0);
	    if(Character.isLetter(ch)){
	        System.out.println(ch+" is a alphabet");
	    }
	    else if(Character.isDigit(ch)){
	        System.out.println(ch+" is a digit");
	    }
	    else {
	        System.out.println(ch+" is a special symbol");
	    }
	    

	}
}
