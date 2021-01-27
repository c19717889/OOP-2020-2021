package ie.tudublin;

//The cat class extends the animal class - it is a subclass
public class Cat extends Animal
{
    //Constructor for the cat class - passing in String name
    //So the cat has a name
    public Cat(String name)
    {
        //This passes the String name parameter for dog into the super
        //clas constructor because the dog class extends animal
        super(name);
    }

    //Private Field - every animal has a name
    //Private means it can only accessed by methods inside the animal class
    private int numLives;

    //Public Accessor method to access the private field and get name
    //Getter/Accesssor
    public int getnumLives()
    {
        //Gets access to the private field
        return numLives;
    }
    //public Accessor Setter Method to set the private field
    public void setnumLives(int numLives)
    {
        //We assign the numLives parameter to name private field
        //because there are two variable called name and now 
        //we have to disambiguate between them
        this.numLives = numLives;
    }

     //The contructor is a method that gets called when the class Animal 
    // gets instanciated/created. The contructor method always takes the
    //same name as the class.
    //Note, it does not have a return type. If it did it would not be a constructor.
    public Animal(int numLives)
    {
        this.numLives = 9;
    }

   
}