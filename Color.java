import java.util.Scanner;

class Color {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //this will make a post request
    System.out.println("What is your favorite color?"); //user sees

    String color = input.nextLine();  // Get user input
    System.out.println("Nice, I like " + color + " too");
  }
}