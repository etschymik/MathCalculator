import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stillCalculating = true;
        Scanner s = new Scanner(System.in);
        String input = "";
        int symbolLocation = 0;
        int firstNumber;
        int secondNumber;
        String symbol;
        int answer = 0;
        String playAgain;

        System.out.println("Welcome to my calculator");
        while(stillCalculating) {
            // asks and collects input for calculations
            boolean noEquation = true;
            while(noEquation) {
                System.out.println("Enter the equation (press 'i' for valid operators): ");
                input = s.nextLine();
                if (input.equals("i") || input.equals("I")) {
                    showOperators();
                    noEquation = true;
                } else {
                    noEquation = false;
                }
            }

            // finds the location of the symbol
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) < '0') {
                    symbolLocation = i;
                    break;
                }
            }

            // breaks the string into individual parts
            firstNumber = Integer.parseInt(input.substring(0, symbolLocation));
            secondNumber = Integer.parseInt(input.substring(symbolLocation + 1));
            symbol = input.substring(symbolLocation, symbolLocation + 1);

            // find operation and do operation
            switch (symbol) {
                case "+" -> answer = firstNumber + secondNumber;
                case "-" -> answer = firstNumber - secondNumber;
                case "*" -> answer = firstNumber * secondNumber;
                case "/" -> answer = firstNumber / secondNumber;
                case "^" -> answer = (int) Math.pow(firstNumber, secondNumber);
            }
            System.out.println("--------------------------");
            System.out.println("The answer is " + answer);
            System.out.println("--------------------------");

            boolean badInput = true;
            while(badInput) {
                System.out.print("\nWould you like to play again (y/n): ");
                playAgain = s.nextLine();
                if(playAgain.equals("y") || playAgain.equals("Y")) {
                    badInput = false;
                    stillCalculating = true;
                    System.out.println();
                } else if (playAgain.equals("n") || playAgain.equals("N")) {
                    badInput = false;
                    stillCalculating = false;
                    System.out.println("Thanks for playing");
                } else {
                    badInput = true;
                    System.out.println("Enter a valid input");
                }
            }
        }
    }

    public static void showOperators() {
        System.out.println("add (+)");
        System.out.println("subtract (-)");
        System.out.println("multiply (*)");
        System.out.println("divide (/)");
        System.out.println("power (^)\ttake a number to the power of the second");
        System.out.println();
    }
}
