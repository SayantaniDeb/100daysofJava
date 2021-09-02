package day2;
import java.util.Scanner;
public class sumpdt{
    public static int subtractProductAndSum(int n) {
        
        int sum=0, pdt=1;
           while(n!=0){
               
               int rem= n%10;
               sum= sum+rem;
               pdt= pdt*rem;
               n=n/10;
           }
          int result= pdt-sum;
       return result;
           
       
   }


    public static void main(String[] args) {
        
            Scanner in= new Scanner(System.in);
            System.out.print("input n: ");
            int n= in.nextInt();
            int result = subtractProductAndSum(n);
           // in.close();
            
            
        System.out.println("Result= "+result);
            
        }
        
    }
