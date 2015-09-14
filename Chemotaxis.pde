

 //declare bacteria variables here
 Bacteria one;   
 void setup()   
 {     
 	size(400, 400);
 	one = new Bacteria();
 	

 	//initialize bacteria variables here   
 }   
 void draw()   
 {    
 	background(0);
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
 	void move()
 	{
 		myX = myX + (int)(math.Rondom() * 3 - 1);
 		myY = myY + (int)(math.Random() * 3 - 1);
 	}
 	void show()
 	{
 		ellipse(myX, myY, 10, 10);
 	}

 	//lots of java!   
 }    