import java.lang.*;
import java.util.Scanner;

public class CBSEResult {
    public static void main(String[] args){
    System.out.println("Enter the marks of 5 subjects:");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of Maths Subject:");
    int maths = sc.nextInt();
    System.out.println("Enter the marks of Physics subject:");
    int physics = sc.nextInt();
    System.out.println("Enter the marks of Chemistry subject:");
    int chemistry = sc.nextInt();
    System.out.println("Enter the marks of Biology subject:");
    int biology = sc.nextInt();
    System.out.println("Enter the makrs of English subject:");
    int english = sc.nextInt();

    float percentage = ((maths+physics+chemistry+biology+english)/500.0f)*100;
    System.out.println("your percentage:"+ percentage + "%");
    }
}