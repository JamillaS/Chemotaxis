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



 //declare bacteria variables here
 Bacteria one;   
 public void setup()   
 {     
 	size(400, 400);
 	
 	

 	//initialize bacteria variables here   
 }   
 public void draw()   
 {    
 	background(0);
 	one = new Bacteria();
 	one.move();
 	one.show();
 	//move and show the bacteria   
 }  
 class Bacteria    
 {
 	int myX, myY, bColor;
 	Bacteria(int x, int y)
 	{
 		myX = 200;
 		myY = 200;
 		//bColor = fill((int)(math.random() * 255),(int)(math.random() * 255),(int)(math.random() * 255));
 	}
 	public void move()
 	{
 		myX = myX + (int)(math.Rondom() * 3 - 1);
 		myY = myY + (int)(math.Random() * 3 - 1);
 	}
 	public void show()
 	{
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
