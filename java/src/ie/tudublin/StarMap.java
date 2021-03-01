package ie.tudublin;

import java.util.ArrayList;

import javax.swing.text.TableView.TableRow;

import processing.core.PApplet;
import processing.data.Table;

public class StarMap extends PApplet {

    //array list can grow and shrink
    //generic array
    //empty array list
    ArrayList<Star> stars = new ArrayList<>();

    //table object for csv file
    void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow row:table.rows())
        {
            Star s = 
        }

    }

    public void settings() {
        size(500, 500);
    }

    public void mouseClicked()
    {
        println("Mouse clicked");
    }

    public void setup() {
        colorMode(RGB);
    }

    public void draw() {
        background(0);
    }
}