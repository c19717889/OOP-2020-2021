package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet{


	float playerX = 40; 
	float playerY = 20; 
    float playerWidth = 40;


    public void settings()
	{
		// If you want to use the width and 
		// height variables, they have to be after settings 
		// is called
		size(500, 500);
    }
    
    public void setup() {
		
    }
    
    public void draw()
	{	// Takes 1 or 3 parameters. 1 is greyscale, 3 is RGB
         //background(0);   
         
        drawPlayer(playerX, playerY);
    }
    void drawPlayer(float x, float y)
    {
        stroke(0);
		strokeWeight(3);

		line(x, playerY, x, x);
        playerX = playerWidth/2;
        playerY = playerWidth /2;
        
    }

    public void keyPressed()
	{
		
		if(keyPressed)
		{
		if (keyCode == LEFT)
		{
			playerX ++;
			
		}
		if (keyCode == RIGHT)
		{
			playerX --;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}
	}	
    
}
