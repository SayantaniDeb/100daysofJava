package day1;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input.
public class First{
    public static void main(String[] args){
        System.out.println("Enter your number: ");

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        if(n%2==0){
            System.out.println(n +" is even");
        }
        else{
            System.out.println(n +" is odd");
        }
    }

        
    }
