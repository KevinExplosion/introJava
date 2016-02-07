import java.io.Console;

public class Grades {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Did you receive an A, B, C, D, or F letter grade this term?");

    String userGrade = console.readLine();

    Boolean gradeA = userGrade == "A";
    Boolean gradeB = userGrade == "B";

    if(gradeA || gradeB) {
      System.out.println("That's pretty damned good!");
    } else if (userGrade == "C") {
      System.out.println("Your average! Congrats, slacker!");
    } else if ((userGrade == "D") || (userGrade == "F")) {
      System.out.println("What the...I don't...why? Nevermind.");
    } else {
      System.out.println("Your inability to follow simple instructions is pretty telling of what grade you received...");
    }
  }
}
