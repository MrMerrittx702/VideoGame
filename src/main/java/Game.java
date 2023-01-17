public class Game 
{
  boolean bonus;
 
  private Level levelOne;
  private Level levelTwo;
  private Level levelThree;
  
  /** Postcondition All instance variables have been initialized. */
  public Game(boolean one, boolean two, boolean three, boolean bonus) {
    //implementation would not be shown
    this.levelOne = new Level(one, 200);
    this.levelTwo = new Level(two, 100);
    this.levelThree = new Level(three, 500);
    this.bonus = bonus;
  }  
  
  /** Returns true if this game is a bonus game and returns false otherwise */
  public boolean isBonus() {
    //not shown
    if(bonus) {
      return true;
 
    }
    else {
      return false;
    }
  }
  
  /** Simulates the play of this Game (consisting of three levels) and updates all relevant game data */
  public void play() {
    //implementation not shown
    boolean[] array = new boolean[4];
    for(int i = 0; i < array.length;i++) {
      int sim = (int)(Math.random() * 2);
      if(sim == 1) {
        array[i] = true;
      }
      else if (sim == 0) {
        array[i] = false;
      }
    }
    
    levelOne.goal = array[0];
    levelTwo.goal = array[1];
    levelThree.goal = array[2];
    bonus = array[3];
    
  }
  
  /** Returns the score earned in the most recently played game, as described in part (a) */
  public int getScore() {
    //implemented in part (a)
    
  }
  
  /** Simulates the play of num games and returns the highest score earned, as described in part (b) 
   *described in part (b)
   *Precondition num > 0
   */
  public int playManyTimes(int num) {
    //implement in part (b)
    
  }
  
  //There may be instance variable, constructors, and methods that are not shown.
 
}
