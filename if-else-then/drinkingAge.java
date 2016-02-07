import java.io.Console;

public class drinkingAge {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Are you old enough to drink? Please enter your age.");

    String drinkingAgeString = console.readLine();

    Integer drinkingAgeInteger = Integer.parseInt(drinkingAgeString);

    if (drinkingAgeInteger > 20) {
      System.out.println("BOOZE! ALCOHOL! DRUNKEDNESS!!!");
    } else {
      System.out.println("I mean...you can drink, but...");
    }
  }
}
