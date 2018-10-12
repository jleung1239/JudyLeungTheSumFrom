package JudyL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer n:");
        int n = input.nextInt();
        int out = 0;
        if (n >= 0)
        {
            for (int count = 1 ; count <= n ; count ++)
            {
                out = out + count;
            }
        }
        else
        {
            for (int index = n ; index <= 1 ; index++)
            {
                out = out + index;
            }
        }
        System.out.println("The sum from 1 to " + n + " is " + out + ".");
    }
}
