package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

    public float map1 (float from, float start1, float stop1, float start2, float stop2) 
    {
        float range1 = stop1 - start1;
        float range2 = stop2 - start2;
        float howFar = from - start1;

        return start2 + (howFar / range1) * range2;
        
    }
    public void settings() {
        size(500, 500);  
        
        float f = map1(2, 0, 10, 0, width);
        println(f);

        f = map1(9, 0, 1, 0, 10);
        println(f);

        f = map1(250, 200, 300, 400, 500);
        println(f);

        f = map1(5, 0, 10, 1000, 2000);
        println(f);

    }

    int mode = 0;

    float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    float[] arr = new float[100]; //100 flaot array

    public void keyPressed() {
        // the value of mode will be the number of the 
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);

        for (int i = 0 ; i < rainfall.length ; i++)
        {
            println(months[i] + "\t" + rainfall[i]);
        }
 

        int minIndex = 0;
        int maxIndex = 0;
        float sum = 0;

        for (int i = 0 ; i < rainfall.length ; i ++)
        {
            if(rainfall[i] < rainfall[minIndex])
            {
                minIndex = i;
            }
            
            if(rainfall[i] > rainfall[maxIndex])
            {
                maxIndex = i;
            }
            sum += rainfall[i];
        }
        float average = sum / (float) rainfall.length;
        println("Least rain fall was in " + months[minIndex] + " with " + rainfall[minIndex]);
        println("Most rain fall was in " + months[maxIndex] + " with " + rainfall[maxIndex]);
        println("Average rainfall average was " + average);
        //Enhanced for loop
        /*for (float f:rainfall)
        {
            println(f);
        }*/
    }

    float offset = 0;

    public void draw() {
        background(0);
        noStroke();
    }
}
