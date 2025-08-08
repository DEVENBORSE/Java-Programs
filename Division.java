import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        try {
            int result = num1/num2;
            System.out.println("The result of division is:" + result);
            if (result < 0.01){
                throw new Exception("Result is less than 0.01");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } catch (Exception e){
            System.out.println("Error:"+ e.getMessage());
        }
    }
}
