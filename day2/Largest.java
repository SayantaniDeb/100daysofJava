package day2;

import java.util.Scanner;

/*Take integer inputs till the user enters 0 and print the largest number from
all.*/
public class Largest {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int input;
        int i=0;
        do{
            System.out.println("Input: ");
            input= in.nextInt();
            if(i<input){
                i=input;
            }
         }
        while(input!=0);

        System.out.println(i);
        
    }
    
}
