//int colX = 110;
//int colY = 100;
int a = (int)(Math.random() * 400);
 int b = (int)(Math.random() * 400);
int colX = (int)(Math.random() * 400);
int colY = (int)(Math.random() * 400);
Bacteria [] colony;
//Bacteria two;
 //declare bacteria variables here
 //Bacteria one;   
 void setup()   
 {     

 	colony = new Bacteria[20];
 	for(int x = 0; x < 20; x ++)
 	{
 		colony[x] = new Bacteria();

 	}
 	size(400, 400); 
 	frameRate(30);
 	
 }   
 void draw()   
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
 	void move()
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
 	void show()
 	{
 		fill(bColor);
 		noStroke();
 		ellipse(myX, myY, 10, 10);
 		fill(255);
 		for (int i = 0; i < 10; i++)
 		{
 			
 			ellipse(colX,colY, 7, 7);
 			
 			ellipse(a,b, 7, 7);
 			
			//colY = (int)(Math.random() * 400);
 		}
 		//colY = (int)(Math.random() * 400);
 		//colX = (int)(Math.random() * 400);
 		if(get(myX,myY) == color(255,255,255))

 		{
 			fill(0);

 			ellipse(colX,colY, 7, 7);
 			ellipse(a,b, 7, 7);
 			colX = (int)(Math.random() * 400);
			colY = (int)(Math.random() * 400);
			a = (int)(Math.random() * 400);
			b = (int)(Math.random() * 400); 			
 		}
 		
 	}

 	//lots of java!   
 }    
 
 
 	
 