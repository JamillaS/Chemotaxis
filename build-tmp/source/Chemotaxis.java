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

int colX = 110;
int colY = 100;

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
 		/*
 		fill(255);
 		ellipse(colX,colY, 50, 50);
 		if(get(x,y) != color(255,255,255))
 		{
 			fill(0);
 			ellipse(colX,colY,5, 5);
 			colX = (int)(Math.random() * 400);
			colY = (int)(Math.random() * 400);
 		}
 		*/

 	}  

 }  

 
 class Bacteria    
 {
 	int myX, myY, bColor;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		bColor = color((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255));
 		
 	}
 	public void move()
 	{
 		myX = myX + (int)(Math.random() * 5)- 2;
 		myY = myY + (int)(Math.random() * 5)- 2;
 		if(mouseX  >= myX && mouseY >= myY)
 		{
 			myX = myX + (int)(Math.random() * 5) - 5;
 			myY = myY + (int)(Math.random() * 5)+ 5;
 		}
 		if(mouseX  >= myX && mouseY < myY)
 		{
 			myX = myX + (int)(Math.random() * 5) + 5;
 			myY = myY + (int)(Math.random() * 5) - 5;
 		}
 		if(mouseX  < myX && mouseY < myY)
 		{
 			myX = myX + (int)(Math.random() * 5) - 5;
 			myY = myY + (int)(Math.random() * 5) - 5;
 		}
 		if(mouseX  < myX && mouseY < myY)
 		{
 			myX = myX + (int)(Math.random() * 5) - 5;
 			myY = myY + (int)(Math.random() * 5) - 5;
 		}
 		/*
 		if(colX >= 200 && colY >= 200)
 		{
 			myX = myX + (int)(Math.random() * 5)+ 1;
 			myY = myY + (int)(Math.random() * 5)+ 1;
 		}
 		if(colX < 200 && colY < 200)
 		{
 			myX = myX + (int)(Math.random() * 5) - 3;
 			myY = myY + (int)(Math.random() * 5) - 1;
 		}
 		if(colX < 200 && colY >= 200)
 		{
 			myX = myX + (int)(Math.random() * 5) - 1;
 			myY = myY + (int)(Math.random() * 5) - 1;
 		}
 		if(colX >= 200 && colY < 200)
 		{
 			myX = myX + (int)(Math.random() * 5)+ 1;
 			myY = myY + (int)(Math.random() * 5) - 1;
 		}
 		*/
 	}
 	public void show()
 	{
 		fill(bColor);
 		noStroke();
 		ellipse(myX, myY, 10, 10);
 		fill(255);
 		ellipse(colX,colY, 100, 100);
 		if(get(myX,myY) == color(255,255,255))
 		{
 			fill(0);
 			ellipse(colX,colY, 100, 100);
 			colX = (int)(Math.random() * 400);
			colY = (int)(Math.random() * 400);
 			
 		}
 		
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
