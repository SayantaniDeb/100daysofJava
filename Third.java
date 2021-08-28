import java.util.Scanner;
public class Third {
    //Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("INPUT Principle: ");
        int P=input.nextInt();
        System.out.println("INPUT Rate: ");
        int R=input.nextInt();
        System.out.println("INPUT Time: ");
        int T=input.nextInt();

        int Simple_interest= (P*R*T)/100;
        System.out.println(Simple_interest);

    }
    
}
