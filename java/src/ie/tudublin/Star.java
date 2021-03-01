package ie.tudublin;

import processing.data.TableRow;

public class Star {
    //private fields
    private boolean hab;
    private String desplayName;
    private float distance;
    private float xG, yG, zG;
    private float absMag;

    

    //constructors
    //method is called when class is created
    public Star()
    {

    }

    public Star(TableRow row)
    {
        //constructor chaining
        this(row.getInt("Hab?") == 1 ? true : false, 
        row.getString("Display Name"),
        row.getFloat("Distance"),
        row.getFloat("xG"),
        row.getFloat("yG"),
        row.getFloat("zG"),
        row.getFloat("AbsMag")

    };

    public Star(boolean hab, String desplayName, float distance, float xG, float yG, float zG)
    {
        this.hab = hab;
        this.desplayName = desplayName;
        this.distance = distance;
        this.xG = xG;
        this.yG = yG;
        this.xG = zG;
        this.absMag = absMag;

    }

    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }

    public String getDesplayName() {
        return desplayName;
    }

    public void setDesplayName(String desplayName) {
        this.desplayName = desplayName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getxG() {
        return xG;
    }

    public void setxG(float xG) {
        this.xG = xG;
    }

    public float getyG() {
        return yG;
    }

    public void setyG(float yG) {
        this.yG = yG;
    }

    public float getzG() {
        return zG;
    }

    public void setzG(float zG) {
        this.zG = zG;
    }

    public float getAbsMag() {
        return absMag;
    }

    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }
    
    public String toString()
    {
        return "Star [hab + "\t" + desplayName + "\t" + distance + "\t" + xG + "\t" + yG + "\t" + xG]";
    }
}
