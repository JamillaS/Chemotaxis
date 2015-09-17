
int col;
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
void food() 
 {
 	if(mouseMoved && mousePressed * mouseReleased) {
 		
 	}
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
 	void move()
 	{
 		myX = myX + (int)(Math.random() * 5)- 2;
 		myY = myY + (int)(Math.random() * 5)- 2;
 	}
 	void show()
 	{
 		fill(bColor,bColor,bColor);
 		ellipse(myX, myY, 10, 10);
 	}

 	//lots of java!   
 }    