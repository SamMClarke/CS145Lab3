public class LetterInventory
{
    private int[] count = new int[26];
    private int size;

    public LetterInventory(String data)
    {
        for (int i = 0; i < data.length(); i++)
        {
            if (getIndexOf(data.charAt(i)) >= 0 && getIndexOf(data.charAt(i)) <= 25)
            {
                size++;
                count[getIndexOf(data.charAt(i))]++;
            }
        }
    }

    private int getIndexOf(char letter)
    {
        return (int) Character.toLowerCase(letter) - 97;
    }

    private char getLetterOf(int index)
    {
        return (char) (index + 97);
    }

    private boolean isValidLetter(char letter)
    {
        if ((int) Character.toLowerCase(letter) - 97 < 0 || (int) Character.toLowerCase(letter) - 97 > 25)
        {
            return false;
        }
        return true;
    }

    public int get(char letter) throws IllegalArgumentException
    {
        if (!isValidLetter(letter))
        {
            throw new IllegalArgumentException();
        }
        return count[getIndexOf(letter)];
    }

    public void set(char letter, int value) throws IllegalArgumentException
    {
        if (!isValidLetter(letter) || value < 0)
        {
            throw new IllegalArgumentException();
        }
        size += value - count[getIndexOf(letter)];
        count[getIndexOf(letter)] = value;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        String returnString = "[";
        for (int i = 0; i < count.length; i++)
        {
            for (int j = 0; j < count[i]; j++)
            {
                returnString += getLetterOf(i);
            }
        }
        return returnString + "]";
    }
}