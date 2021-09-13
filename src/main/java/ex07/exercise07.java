/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex07;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();

        int area = length*width;
        double sqmeters = area*0.09290304;

        System.out.print("You entered dimension of "+length+" feet by "+width+" feet.");
        System.out.print("The area is\n"+area+" square feet\n"+sqmeters+" square meters");

    }
}
