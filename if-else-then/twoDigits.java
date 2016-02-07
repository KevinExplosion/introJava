import java.io.Console;

public class twoDigits {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Lets do a magic trick! Give me a number, and I will tell you if it's two digits or not!");

    String twoDigitsString = console.readLine();

    Integer twoDigitsInteger = Integer.parseInt(twoDigitsString);

    if ((twoDigitsInteger < 9) || (twoDigitsInteger > 99)) {
      System.out.println("Your number is not composed of two digits!");
    } else {
      System.out.println("Your number is composed of two, and ONLY two numbers!");
    }
  }
}
