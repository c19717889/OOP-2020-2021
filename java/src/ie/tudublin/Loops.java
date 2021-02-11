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
                fill(50, 255, 255);                    
                if (mouseX < cx)
                {
                    rect(0, 0, cx, height);
                }
                else
                {
                    rect(cx, 0, cx, height);
                }
                break;
            case 1:
                fill(50, 255, 255);                                    
                if (mouseX < cx && mouseY < cy)
                {
                    rect(0, 0, cx, cy);
                }
                else if (mouseX > cx && mouseY < cy)
                {
                    rect(cx, 0, cx, cy);
                }
                else if (mouseX < cx && mouseY > cy)
                {
                    rect(0, cy, cx, cy);
                }
                else
                {
                    rect(cx, cy, cx, cy);
                }
                break;
            case 2:
            {
                int numRects = (int)(width / 30.0f);
                float w = width / (float) numRects;
                float cgap = 255 / (float) numRects;
                for(int i = 0 ; i < numRects ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    rect(i * w, 0, w, height);
                }
                break;
            }
            case 3:
            {
                //int numCircles = (int)(mouseX / 10.0f);
                int numCircles = (int)(mouseX / 10.0f);
                float w = width / (float) numCircles;
                float cgap = 255 / (float) numCircles;
                for(int i = 0 ; i < numCircles ; i ++)
                {
                    fill(cgap * i, 255, 255);
                    ellipse(w / 2 + (i * w), cy, w, w);
                }
            }
            break;

            case 4:
            {
                fill(50, 255, 255);  
                float smlsqr1 = 42;
                float smlsqr2 = 42;
                int numRects = (int)(width / smlsqr1);
                float cgap = 255 / (float) numRects;

                rect(0, 0, smlsqr1, smlsqr1);
                fill(40, 255, 255);
                rect(smlsqr2, smlsqr2, smlsqr1, smlsqr1);
                int count = 1;
                for (int i = 0; i < numRects; i++)
                {
                    fill(cgap * i, 255, 255);
                    rect(smlsqr2 * count, smlsqr2 * count, smlsqr1, smlsqr1);
                    count ++;
                }
                /*rect(smlsqr2 * 2, smlsqr2 * 2, smlsqr1, smlsqr1);
                rect(smlsqr2 * 3, smlsqr2 * 3, smlsqr1, smlsqr1);
                rect(smlsqr2 * 4, smlsqr2 * 4, smlsqr1, smlsqr1);
                //smlsqr2 += 40;
                rect(smlsqr2 * 5, smlsqr2 * 5, smlsqr1, smlsqr1);


                /*int numRects = (int)(width / 40.0f);
                //int numHoraz = (int) (height / 30.0f);
                //float w = width / (float) numRects;
                float h = height / (float) numHoraz;
                float cgap = 255 / (float) numHoraz;
                for(int i = 0 ; i < numHoraz ; i ++)
                {
                    fill(i * cgap, 255, 255);
                    //rect(i * w, 0, w, height);
                    rect(i * h, 0, h, width);
                }*/
                
            }
            break;

            case 5:
                fill(255, 255, 255);
                stroke(255);
                int numLines = 5;
                float theta = TWO_PI / (float) numLines;
                float radius = 100;
                for(int i = 0; i < numLines; i++)
                {
                    float angle = theta * i;
                    float x = sin(angle) * radius;
                    float y = cos(angle) * radius;
                    line(cx, cy, cx + x, cy + y);
                }
        }
    }
}
