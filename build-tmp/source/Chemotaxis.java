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

//int colX = 110;
//int colY = 100;
int a = (int)(Math.random() * 400);
int b = (int)(Math.random() * 400);
int colX = (int)(Math.random() * 400);
int colY = (int)(Math.random() * 400);
Bacteria[] colony;
float size = 10;
//Bacteria two;
 //declare bacteria variables here
 //Bacteria one;   
 public void setup()   
 {     

 	colony = new Bacteria[20];
 	for(int x = 0; x < colony.length; x ++)
 	{
 		colony[x] = new Bacteria();

 	}
 	size(400, 400); 
 	frameRate(30);
 	
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
 		if(mousePressed)
 		{
 		if(mouseX  >= myX && mouseY >= myY)
 		{
 			myX = myX + (int)(Math.random() * 5) - 5;
 			myY = myY + (int)(Math.random() * 5) + 5;
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
 		if(mouseX  < myX && mouseY > myY)
 		{
 			myX = myX + (int)(Math.random() * 5) - 5;
 			myY = myY + (int)(Math.random() * 5) - 5;
 		}
 	}
 		/*
 		if(colX >= 200 && colY >= 200)
 		{
 			myX = myX + (int)(Math.random() * 5)+ 2;
 			myY = myY + (int)(Math.random() * 5)+ 2;
 		}
 		if(colX < 200 && colY < 200)
 		{
 			myX = myX + (int)(Math.random() * 5) - 2;
 			myY = myY + (int)(Math.random() * 5) - 2;
 		}
 		if(colX < 200 && colY >= 200)
 		{
 			myX = myX + (int)(Math.random() * 5) - 2;
 			myY = myY + (int)(Math.random() * 5) - 2;
 		}
 		if(colX >= 200 && colY < 200)
 		{
 			myX = myX + (int)(Math.random() * 5)+ 2;
 			myY = myY + (int)(Math.random() * 5) - 2;
 		}
 		*/
 	}
 	public void show()
 	{
 		fill(bColor);
 		noStroke();
 		ellipse(myX, myY, size, size);
 		fill(255);
 		for (int i = 0; i < 10; i++)
 		{
 			fill(255,255,254);
 			ellipse(a,b, 5, 5);
 			fill(255,255,255);
 			ellipse(colX,colY, 5, 5);
 			
 			
			//colY = (int)(Math.random() * 400);
 		}
 		//colY = (int)(Math.random() * 400);
 		//colX = (int)(Math.random() * 400);
 		if(get(myX,myY) == color(255,255,255))

 		{

 			
 			fill(0);

 			ellipse(colX,colY, 5, 5);
 			//ellipse(a,b, 7, 7);
 			colX = (int)(Math.random() * 400);
			colY = (int)(Math.random() * 400);
			//a = (int)(Math.random() * 400);
			//b = (int)(Math.random() * 400); 			
 		}
 		else if(get(myX,myY) == color(255,255,254))
 		{
 			size = size + 0.3f;
 			fill(0);
 			ellipse(a,b,5,5);
 			a = (int)(Math.random() * 400);
			b = (int)(Math.random() * 400);
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
