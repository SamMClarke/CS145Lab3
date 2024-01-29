public class Lab3Main
{
    public static void main(String[] args)
    {
        LetterInventory test = new LetterInventory("abc");
        LetterInventory test2 = new LetterInventory("cde");


        System.out.println(test.size()); //29

        System.out.println(test.get('a'));

        test.set('a', 0);

        System.out.println(test.get('a'));

        System.out.println(test.size()); //25

        System.out.println((char) 97);

        System.out.println(test);

        LetterInventory added = test.add(test2);

        LetterInventory subbed = added.subtract(test);

        System.out.println(added);

        System.out.println(subbed);
    }
}