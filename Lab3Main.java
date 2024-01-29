public class Lab3Main
{
    public static void main(String[] args)
    {
        //Test get and set methods
        System.out.println("Test get and set methods:");
        LetterInventory invOne = new LetterInventory("abcabc");
        System.out.println(invOne.get('a'));
        invOne.set('a', 10);
        System.out.println(invOne.get('a'));

        //Test size and is empty methods
        System.out.println("\nTest size and isEmpty methods:");
        LetterInventory invTwo = new LetterInventory("abc^%");
        System.out.println(invTwo.size());
        invTwo.set('a', 0);
        invTwo.set('b', 0);
        invTwo.set('c', 0);
        System.out.println(invTwo.size());
        if (invTwo.isEmpty())
        {
            System.out.println("Its Empty!");
        }

        //Test toString method
        LetterInventory invThree = new LetterInventory("Hi, This is fun!");
        System.out.println(invThree);

        //Test add and subtract methods
        LetterInventory invFour = new LetterInventory("abcabcabc");
        LetterInventory invFive = new LetterInventory("abcabc");
        
        LetterInventory subbed = invFour.subtract(invFive);
        LetterInventory added = invFour.add(invFive);

        System.out.println(subbed);
        System.out.println(added);

        LetterInventory illegalSubtract = invFive.subtract(invFour);
        System.out.println(illegalSubtract);
    }
}