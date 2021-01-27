package ie.tudublin;

//The cat class extends the animal class - it is a subclass
public class Cat extends Animal
{
    //Private Field - every cat has lives
    //Private means it can only accessed by methods inside the animal class
    private int numLives;

    //Constructor for the cat class - passing in String name
    //So the cat has a name and assign the numLives to 9
    public Cat(String name)
    {
        //This passes the String name parameter and numLives for cat into the super
        //clas constructor because the cat class extends animal
        super(name);
        numLives = 9;
    }

    //Kill method to check if the cats lives is a zero
    void kill()
    {
            if (numLives > 0) 
            {
                    numLives--;
                    System.out.println("Ouch");
            }
            else
            {
                    System.out.println("Dead");
            }
    }

    //Public Accessor method to access the private field and get the amount of lives left
    //Getter/Accesssor
    public int getnumLives()
    {
        //Gets access to the private field
        return numLives;
    }
    //public Accessor Setter Method to set the private field
    public void setnumLives(int numLives)
    {
        //We assign the numLives parameter to the private field
        //because there are two variable called numLives and now 
        //we have to disambiguate between them
        this.numLives = numLives;
    }

}