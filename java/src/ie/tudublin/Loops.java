package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;        
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
        background(0);
        noStroke();
        switch (mode)
        {
            case 0:
            fill(20,255,255);
                if(mouseX < cx)
                {

                    rect (0, 0, cx, height);
                }
                
                else 
                {
                    rect(cx, 0, cx, height);
                }
                break;

                case 1:
                fill(20,255,255);
                    if(mouseX < cx)
                    {
    
                        rect (0, 0, cx, height/2);
                        //rect (0, 0, cx, width/2);
                    }
                    
                    else 
                    {
                        rect(cx, 0, cx, width/2);
                        
                    }
                    break;
        }
    }
}
