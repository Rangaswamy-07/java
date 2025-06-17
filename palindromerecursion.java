public class palindromerecursion{
    public boolean fun(String s,int i,int j){
        
        if(i == j){ 
            
            return true;
     
         }
         if(s.charAt(i) != s.charAt(j)) return false;
        return fun(s,i+1,j-1);
    }
    public static void main(String[] args){
        palindrome m = new palindrome();
        int [] a={1,2,3,4,5};
        String s="madam";
        int i=0;
        int j=s.length()-1;
        
        System.out.println(m.fun(s,i,j));
    }
}
