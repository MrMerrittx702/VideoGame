public class Level {
  boolean goal = false;
  private int points = 0;
  
  public Level(boolean goal,int points) {
    this.goal = goal;
    this.points = points;
    
  }
  /** Returns true if the player reached the goal on this level and returns false otherwise */
  public boolean goalReached() {
    //implementation would not be show
    return goal;
  }
  
  public int getPoints() {
    //implementation would not be sho
    return points;
  }
  
  //There may be instance variable, constructors, and methods that are not shown.
  
}
