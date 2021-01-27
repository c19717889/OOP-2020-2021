package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Dog("Misty");

        Animal topCat = new Cat("TopCat");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        Animal ginger = new Cat ("Ginger", 9);
        System.out.println(ginger);

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 


    }
    /*public static void kill(String name, int numLives)
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
    }*/
} 