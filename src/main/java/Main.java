import java.util.Scanner;

public class Main {

    public static void main(String args[])  //static method
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator App!");

        Calculator calc = new Calculator();

        while((input = scanner.nextLine()).equals("") == false) {
            String[] split = input.split(" ");

            switch (split[0]) {
                case "add":
                    System.out.println(calc.add(Integer.parseInt(split[1]),Integer.parseInt(split[2])));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(Integer.parseInt(split[1]),Integer.parseInt(split[2])));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(Integer.parseInt(split[1]),Integer.parseInt(split[2])));
                    break;
                case "divide":
                    System.out.println(calc.divide(Integer.parseInt(split[1]),Integer.parseInt(split[2])));
                    break;
                case "fibonacci":
                    System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(split[1])));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(Integer.parseInt(split[1])));
                    break;
                default:
                    System.out.println("What?");
            }
        }

        System.out.println("Goodbye!");
        System.exit(0);
    }
}
