import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {
  
  

  @Test
  void test_getScore1() {
   
    Game test = new Game(true,true,true,true);
    
    assertEquals(2400,test.getScore());  
  }
  
  @Test
  void test_getScore2() {
   
    Game test = new Game(false,true,true,true);
    
    assertEquals(0,test.getScore());  
  }
  
  @Test
  void test_getScore3() {
   
    Game test = new Game(true,false,true,true);
    
    assertEquals(600,test.getScore());  
  }
  @Test
  void test_getScore4() {
   
    Game test = new Game(true,true,false,true);
    
    assertEquals(900,test.getScore());  
  }
  
  @Test
  void test_getScore5() {
   
    Game test = new Game(true,false,true,false);
    
    assertEquals(200,test.getScore());  
  }
  
  void test_playManyTimes1() {
    
    Game test = new Game(false,false,false,false);
    
    assertEquals(2400,test.playManyTimes(100));  
  }
  
  
  
  

}
