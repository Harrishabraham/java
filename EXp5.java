import java.util.Scanner;
interface Calculator {
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
}
class SimpleCalculator implements Calculator {
    public int add(int num1,int num2) {
        return num1 + num2;
    }
    public int sub(int num1,int num2) {
        return num1 - num2;
    }
    public int mul(int num1,int num2) {
        return num1 * num2;
    }
    public int div(int num1,int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return num1 / num2; 
    }
}
public class Exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        System.out.print("First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Second Number: ");
        int num2 = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Result = " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result = " + calculator.sub(num1, num2));
                break;
            case 3:
                System.out.println("Result = " + calculator.mul(num1, num2));
                break;
            case 4:
                System.out.println("Result = " + calculator.div(num1, num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}