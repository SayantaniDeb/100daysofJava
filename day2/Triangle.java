package day2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("base: ");
        double base= in.nextDouble();
        System.out.println("Height: ");
        double Height= in.nextDouble();
        Double area=(base*Height)/2;
        System.out.println("Area of the triangle: "+area);

    }
    
}
