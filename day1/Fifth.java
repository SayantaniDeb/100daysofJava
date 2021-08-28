package day1;

import java.util.Scanner;

public class Fifth {
    //Take 2 numbers as input and print the largest number.
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println(num1 +" is the largest no.");
        }
        else{
            System.out.println(num2 +" is the largest no.");
        }



    }
}
