import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (var scn = new Scanner(System.in)) {
      System.out.println("What is the address of the stable?");
      var addr = scn.nextLine();
      var horses = new ArrayList<Horse>();

      var quit = false;
      while (!quit) quit = addHorse(scn, horses);

      var stable = new Stable(addr, horses);
      System.out.println(stable);
    }
  }

  /** Will return true if user cancels */
  private static boolean addHorse(Scanner in, ArrayList<Horse> horses) {
    System.out.println("Do you wish to add a horse to the stable?"); 
    var agreed = in.nextLine().equalsIgnoreCase("y");

    if (!agreed) return true;

    System.out.println("What is the name of the horse?");
	var name = in.nextLine();

    System.out.println("What is the weight of the horse?");
	var weight = in.nextDouble();

    System.out.println("Enter true if the horse is tame or false if it is not.");
	var tamed = in.nextBoolean();
    
    in.nextLine();
    horses.add(new Horse(name, weight, tamed));
    return false;
  }
}
