import java.io.Console;

public class addIntegers {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number");

    Integer firstNumber = Integer.parseInt(myConsole.readLine());

    System.out.println("Enter a second number, and I will add it to the first number");

    Integer secondNumber = Integer.parseInt(myConsole.readLine());

    Integer totalNumber = firstNumber + secondNumber;

    String totalNumberString = Integer.toString(totalNumber);

    System.out.println("The total of the two numbers is " + totalNumberString + ".");
  }
}
