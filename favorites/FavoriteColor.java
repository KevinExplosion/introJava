import java.io.Console; //imported to get info from the user

public class FavoriteColor {
  public static void main(String[] args) {
    Console myConsole = System.console(); //essentially sets myConsole as a variable to retrieve information from the user

    System.out.println("What is your favorite color?");
    String favoriteColor = myConsole.readLine(); //save answer into a string data type
    System.out.println("Your favorite color is " + favoriteColor + "? I hate you!"); //print results back
  }
}
