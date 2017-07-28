import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CaptureTheFlag{
  

  public static void main(String[] args){

    Field f = new Field();
    f.START_FROM_BASE = true;
    System.out.println(f.minX + "," + f.minY);


    /* --------------------------------------------- */
    /* create players in the game                    */

//    Player p,q;
//    
//    int NUM_PLAYERS = 1;
//    
//    for(int i=0; i<NUM_PLAYERS; i+=1){
//      // create a player and register them with territory 1
//      p = new Freeer(f, 1, "Cat van Kittenish", 12, "blues", 'b', Math.random()*400+10, Math.random()*500+10);
//      
//      // create a player and register them with territory 2
//      q = new Catcher(f, 2, "Bunny El-Amin", 7, "reds", 'r', Math.random()*400+410, Math.random()*500+10);
//    }
    Team blues=new Team(f, 1, 2, 3, 4);
    Team reds=new Team(f, 3, 1, 1, 2);
    
    /* ------------------------------------------- */
    /* play the game                               */

    boolean gameRunning = true;
    
    long iterations = 0;
    while( gameRunning ){
      iterations += 1;
   
      /* allow players to think about what to do and change directions */
      f.play();
      
      /* move all players */
      f.update();
      
      /* redraw all the players in their new positions */
      f.draw();
      
      
      /* give some message to display on the field */
      if(iterations < 100){
        f.view.message("game on!");
      }else if(iterations < 300){
        f.view.message("keeps on going...");
      }else{
        f.view.message("and going...");
      }
      
      // uncomment this if game is moving too fast , sleep for 10 ms
      //try{ Thread.sleep(10); } catch(Exception e) {}
      
      gameRunning = f.gameStillRunning();
    }
    
    
  }
  
}