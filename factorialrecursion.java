public class factorialrecursion{
    public int fun(int n){
        
        if(n == 1){ 
            
            return n;
     
         }
        return n*fun(n-1);
    }
    public static void main(String[] args){
        factorial m = new factorial();
        
        System.out.println(m.fun(5));
    }
}
