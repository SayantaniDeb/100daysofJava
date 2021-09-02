package day2;

import java.util.Scanner;

// Input a number and print all the factors of that number (use loops).

public class Factors {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("input a  number: ");
        int num=in.nextInt();
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.println(i);
            }
            i++;

            





        }
        
    }
    
}
