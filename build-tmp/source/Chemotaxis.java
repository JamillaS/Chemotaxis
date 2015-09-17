import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {


int col;
Bacteria [] colony;
//Bacteria two;
 //declare bacteria variables here
 //Bacteria one;   
 public void setup()   
 {     

 	colony = new Bacteria[20];
 	for(int x = 0; x < 20; x ++)
 	{
 		colony[x] = new Bacteria();

 	}
 	size(400, 400); 

 	
 }   
 public void draw()   
 {    
 	background(0);
 	
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony[i].move();
 		colony[i].show();
 	}  

 }  
public void mouseMoved() 
 {
 	
 		ellipse((int)(Math.random() * 255), (int)(Math.random() * 255), 10, 10);
 	
 	
 }
 
 class Bacteria    
 {
 	int myX, myY, bColor;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		bColor = (150);
 		
 	}
 	public void move()
 	{
 		myX = myX + (int)(Math.random() * 5)- 2;
 		myY = myY + (int)(Math.random() * 5)- 2;
 	}
 	public void show()
 	{
 		fill(bColor,bColor,bColor);
 		ellipse(myX, myY, 10, 10);
 	}

 	//lots of java!   
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
