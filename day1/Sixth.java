package day1;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        //Input currency in rupee and output in dollar.
        Scanner in= new Scanner(System.in);
        System.out.println("Input the amount in Rupee: ");
        float num= in.nextFloat();
        num= num/64;
        System.out.println("The amount in Dollars is " +num+ "$");

    }
    
}
