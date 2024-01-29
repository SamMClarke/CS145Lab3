public class LetterInventory
{
    private int[] count = new int[26];
    private int size;

    public LetterInventory(String data)
    {
        for (int i = 0; i < data.length(); i++)
        {
            if (getIndexOf(data.charAt(i)) >= 0 && getIndexOf(data.charAt(i)) <= 25) //Ignore non-letters
            {
                size++;
                count[getIndexOf(data.charAt(i))]++; //Add one to current letter count
            }
        }
    }

    private int getIndexOf(char letter) //Gets the count index of a given letter
    {
        return (int) Character.toLowerCase(letter) - 97;
    }

    private char getLetterOf(int index) //Gets the letter of a givne count index
    {
        return (char) (index + 97);
    }

    private boolean isValidLetter(char letter) //Checks whether a letter is alphabetic
    {
        if ((int) Character.toLowerCase(letter) - 97 < 0 || (int) Character.toLowerCase(letter) - 97 > 25)
        {
            return false;
        }
        return true;
    }

    public int get(char letter) //Gets the count for a given letter
    {
        if (!isValidLetter(letter))
        {
            throw new IllegalArgumentException();
        }
        return count[getIndexOf(letter)];
    }

    public void set(char letter, int value) //Sets the count for agiven letter
    {
        if (!isValidLetter(letter) || value < 0) //Makes sure value isn't negative
        {
            throw new IllegalArgumentException();
        }
        size += value - count[getIndexOf(letter)]; //Add the difference to size
        count[getIndexOf(letter)] = value;
    }

    public int size() //Returns the size 
    {
        return size;
    }

    public boolean isEmpty() //Checks if size is 0
    {
        if (size == 0)
        {
            return true;
        }
        return false;
    }

    public String toString() //Prints out a letter inventory
    {
        String returnString = "[";
        for (int i = 0; i < count.length; i++)
        {
            for (int j = 0; j < count[i]; j++) //Print letter count[i] number of times
            {
                returnString += getLetterOf(i);
            }
        }
        return returnString + "]";
    }

    public LetterInventory add(LetterInventory other) //Adds two letter inventories together
    {
        return new LetterInventory(this.toString() + other.toString());
    }

    public LetterInventory subtract(LetterInventory other) //Subtracts two letter inventories together
    {
        int[] newCount = new int[26];
        int subValue;
        String newString = "";

        for (int i = 0; i < count.length; i++)
        {
            subValue = this.get(getLetterOf(i)) - other.get(getLetterOf(i));
            if (subValue < 0) //If the subtracted value is negative
            {
                return null; 
            }
            newCount[i] = subValue; //Fill new count array with subtracted values
        }

        for (int i = 0; i < newCount.length; i++)
        {
            for (int j = 0; j < newCount[i]; j++)
            {
                newString += getLetterOf(i); //Create string for new letter inventory using the new count array
            }
        }

        return new LetterInventory(newString);
    }
}