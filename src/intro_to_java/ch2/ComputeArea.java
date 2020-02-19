/*..........................................................
Let’s first consider the simple problem of computing the
area of a circle.
How do we write a program for solving this problem?
It's a really basic problem to start programming so,
don't worry lets start...
............................................................*/


package intro_to_java.ch2;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble(); //take input
        double area = radius * radius * Math.PI;
        System.out.println("Area of circle is: " + area);
    }
}
