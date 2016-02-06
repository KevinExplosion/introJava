import java.io.Console;

public class integerPlay {
  public static void main ( String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number less than 100. I'll calculate what you would have to add to it to get to 100.");

    Integer inputNumber = Integer.parseInt(myConsole.readLine());

    Integer hundredNumber = 100 - inputNumber;

    String hundredNumberString = Integer.toString(hundredNumber);

    System.out.println("You would have to add " + hundredNumberString + " to " + inputNumber + " to get to 100.");
  }
}
