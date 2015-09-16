
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
 	/*
 	one = new Bacteria();
 	two = new Bacteria();
 	one.move();
 	one.show();
 	two.move();
 	two.show();
 	*/

 	//initialize bacteria variables here   
 }   
 void draw()   
 {    
 	background(0);
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony[i].move();
 		colony[i].show();
 	}
 	//one.move();
 	//one.show();
 	//move and show the bacteria   
 }  
 class Bacteria    
 {
 	int myX, myY, bColor;
 	Bacteria()
 	{
 		myX = 200;
 		myY = 200;
 		//bColor = fill((int)(Math.random() * 255));
 		//bColor = fill((int)(math.random() * 255),(int)(math.random() * 255),(int)(math.random() * 255));
 	}
 	void move()
 	{
 		myX = myX + (int)(Math.random() * 5)- 2;
 		myY = myY + (int)(Math.random() * 5)- 2;
 	}
 	void show()
 	{
 		fill((int)(Math.random() * 255));
 		ellipse(myX, myY, 10, 10);
 	}

 	//lots of java!   
 }    