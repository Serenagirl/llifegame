package lifegame;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;  



/** 
 * …˙√¸”Œœ∑ 
 *  
 */  
  
public class LifeGame extends JFrame{  
  
      
    private static final long serialVersionUID = -1660060555234651445L;  
    
    LifeGame(){  
    	
        this.setSize(700,580);  
        this.setTitle("lifegame");  
        this.add(new Show());      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
        
    }  
      
    public static void main(String[] args){  
        LifeGame game = new LifeGame();  
        game.setVisible(true);  
        
    }  
  
}
