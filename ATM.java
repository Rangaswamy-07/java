//ATM machine
import java.util.*;
public class ATM{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      String yourpin = "1234";
      int balance = 5000;
      double deposit;
      double withdraw;
      System.out.println("enter your pin : ");
      String pin =sc.nextLine();
      if(!yourpin.equals(pin)){
          System.out.println("invalid pin");
      }
      else{
      
     
      System.out.println("your choice 1)check balance 2)deposit 3)withdraw");
      int select = sc.nextInt();
      
      switch(select){
         
          
          case 1:
              
                 System.out.println("your balance is  : "+balance);
              
              break;
        case 2:
        
                System.out.println("enter the deposit cash : ");
                deposit = sc.nextDouble();
                balance+=deposit;
                System.out.println("your current balance:" +balance);
            
              break;
        case 3: 
            
                System.out.println("enter the withdraw cash");
                
                 withdraw = sc.nextDouble();
                 if(balance >= withdraw){
                balance-=withdraw;
                System.out.println("your current balance is " +balance);
                
            }else{
                  System.out.println("insufficient funds");
              }
              break;
         default:
         System.out.println("no data found");
         
      }
    
     
      }
    }
}
