import java.util.Scanner;
public  class SimpleCalculator1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1,num2,result;
        char operator;
        System.out.println("Simple calculator");
        System.out.println("Enter the first number :");
        num1=scan.nextDouble();
        System.out.println("Enter an operator(+,-,*,/): ");
        operator=scan.next().charAt(0);
        System.out.println("Enter the second number: ");
        num2=scan.nextDouble();
        switch (operator){
            case '+':
                result=num1+num2;
                System.out.println("The Result is: "  +result);
                break;
        }
    }
}