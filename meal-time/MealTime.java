import java.io.Console;

public class MealTime {
  public static void main(String[] args) {

    askWhatYouAteForDinner("breakfast");

    askWhatYouAteForDinner("lunch");

    askWhatYouAteForDinner("dinner");
  }

  Console myConsole = System.console();

  public static void askWhatYouAteForDinner(String meal) {
    System.out.println("What did you eat for " + meal + "?");
    String yourBreakfast = myConsole.readLine();
    System.out.println("You had " + yourBreakfast + " for " + meal + ".");
  }
}
