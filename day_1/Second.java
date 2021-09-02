package day_1;
import java.util.Scanner;
//Take name as input and print a greeting message for that name.
public class Second {

    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner scan=new Scanner(System.in);
        
        String name = scan.nextLine();
        System.out.println("Welcome"+" "+name);

    }
    
}
