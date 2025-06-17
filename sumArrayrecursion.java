public class sumArrayrecursion{
    public int fun(int []a,int sum,int i){
        
        if(i == a.length){ 
            
            return sum;
     
         }
         sum+=a[i];
        return fun(a,sum,i+1);
    }
    public static void main(String[] args){
        sumArray m = new sumArray();
        int [] a={1,2,3,4,5};
        int sum=0;
        int i=0;
        
        System.out.println(m.fun(a,sum,i));
    }
}
