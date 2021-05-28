import java.util.Scanner;

class MarsGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, what's your name?");
    
    String name = input.nextLine();  // Get user input
    System.out.println("Hello, " + name + " nice to meet you!");
    System.out.println("What color do you want your spaceship? ");

    String spaceship = input.nextLine();
    System.out.println("Nice! " + spaceship + " that's a good choice");

    System.out.println("Are you bringing a friend?");
    String friend = input.nextLine();
    System.out.println("Your " + friend + " will have fun too");

    System.out.println("What's your friend name?");
    String friendname = input.nextLine();
    System.out.println("Lovely, " + friendname + " it's all ready!");
  }
}
