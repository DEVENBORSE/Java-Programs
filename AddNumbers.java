import java.lang.*;
import java.util.Scanner;

public class AddNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextInt();
        }
        double average = (n > 0) ? (double) sum / n : 0;
        System.out.println("Sum of " + n + " numbers is: " + sum);
        System.out.println("Average is: " + average);
        
    }

//for importing the full string:
// String str= sc.nextLine();
// System.out.println(str);