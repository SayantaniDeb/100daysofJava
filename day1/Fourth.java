package day1;
import java.util.Scanner;
public class Fourth {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("input two numbers: ");
        int num1= in.nextInt();
        int num2= in.nextInt();
        System.out.println("input operator: ");
        char op= in.next().charAt(0);
        int a= num1+num2;
        int b= num1*num2;
        int c= num1/num2;
        int d= num1-num2;
        if(op == '+'){
            System.out.println(a);
        }
        if(op == '*'){
            System.out.println(b);
        }
        if(op == '/'){
            System.out.println(c);
        }
        if(op == '-'){
            System.out.println(d);
        }
}
}
