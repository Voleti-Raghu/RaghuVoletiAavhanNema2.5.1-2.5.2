
public class Player {
  private String name;
  private int points;

  // Default constructor
  public Player() {
      this.name = "Player";
      this.points = 0;
      System.out.println("Welcome, " + name + " to the game!");
  }

  // Parameterized constructor
  public Player(String inputName) {
      this.name = inputName;
      this.points = 0;
      System.out.println("Welcome, " + name + " to the game!");
  }

  // Accessor for name
  public String getName() {
      return name;
  }

  // Accessor for points
  public int getPoints() {
      return points;
  }

  // Mutator for name
  public void setName(String name) {
      this.name = name;
  }

  // Method to add points
  public void addPoints(int points) {
      this.points += points;
  }
}