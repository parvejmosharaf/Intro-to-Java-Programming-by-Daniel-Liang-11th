/*.........................................................

Listing 2.3 gives an example of reading multiple inputs
from the keyboard. The program
reads three numbers and displays their average.

...........................................................*/

package intro_to_java.ch2;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input amount of number to get average: ");
        int num = input.nextInt();
        double sum = 0;

        double[] number = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i+1 + " th number: ");
            number[i] = input.nextDouble();
            sum = sum + number[i];
        }
        double average = sum/num;
        System.out.println("Average is: " + average);
    }
}
