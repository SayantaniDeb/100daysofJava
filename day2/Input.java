package day2;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers.
public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i=0;
        
        int input;
        do{
            System.out.println("Input a  number: ");
            input=in.nextInt();
            i+=input;

        }
         while(input!=0);
            
      
        System.out.println(i);
}
        
    }
    

