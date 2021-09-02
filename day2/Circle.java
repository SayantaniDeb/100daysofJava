//1. Area Of Circle Java Program

package day2;

import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Write your radius: ");
        double radius= in.nextInt();
        double Area= 22/7*(radius*radius);
        System.out.println("The area of the java program is: "+Area);
    }

}