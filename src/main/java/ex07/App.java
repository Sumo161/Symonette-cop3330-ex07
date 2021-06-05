package ex07;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        double length, width, Area;

        Scanner sc = new Scanner(System.in);

        System.out.print(" What is the length of the room in feet?");
        length=sc.nextDouble();

        System.out.print(" What is the width of the room in feet?");
        width=sc.nextDouble();

        Area = length*width;

        System.out.print("You entered dimensions of "+length+" feet by "+width+" feet");

        System.out.println(" The area is "+Area+ "square feet");

        // 1 ft = .929 square meter

        Area=Area/10.764;

                System.out.println("The area is "+Area+" square meter ");

    }
}
