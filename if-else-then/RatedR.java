import java.io.Console;

public class RatedR {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("How old are you, dawg?");
    String stringUserAge = console.readLine();
    Integer integerUserAge = Integer.parseInt(stringUserAge);

    if (integerUserAge >= 17) {
      System.out.println("You can see the movie!");
    } else {
      System.out.println("Get out of here, you big baby.");
    }
  }
}
