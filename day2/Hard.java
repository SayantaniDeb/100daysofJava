package day2;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Hard {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int input;
        int i=0, m=0,n=0;
        System.out.println("input: ");

        do {
            input= in.nextInt();
            if(input<0){
                i+=input;
           }
           else if(input>0 && input%2==0){
               m+=input;
           }
           else if(input>0 && input%2!=0){
               n+=input;
           }

            
} 
 while (input!=0);
 System.out.println(i);
 System.out.println(m);
 System.out.println(n);
}



    
}
