/*
Sam Clarke
1/26/2024
CS145

This program creates a letter inventory class which can be manipulated by the user
*/

//Creates a LetterInventory object given a String as the data parameter
//public LetterInventory(String data)
//Stores the count of each letter in the String data, to a index in a count array
//with a being the 0 index, b being the 1 index, etc...
//if a character is non alphabetic, it is ignored because its index will be out of bounds

//Gets the count of a given letter
//public int get(char letter)
//Finds the index corresponding to the given letter, and returns the value in the count array
//If the given character is non alphabetic, illegal argument exception is thrown

//Sets the count of the given letter to the given value
//public void set(char letter, int value)
//Finds the index corresponding to the given letter, and sets the value in the count array
//to the given value. If a non alphabetic letter is given or a negative number is given,
//throw an illegal argument exception.

//Gets the total sum of all of the counts (total characters in letter inventory)
//public int size()
//The size value will be intialized with the letter inventory and updated
//each time a character is added/removed, so this method will simply
//return that size value.

//Tells whether a given LetterInventory is empty
//public boolean isEmpty()
//If the size value is 0, then return true, otherwise, return false

//Gets a string version of the letter inventory to be printed
//public String toString()
//Go through the count array, and add the the letter at that index "count" number of times
//to a string, which will then be returned.

//Compiles two seperate letter inventorys together
//public LetterInventory add(LetterInventory other)
//Adds together both letter inventory's toString() methods, which will create a compiled string.
//This new string will then be used as the data field to create a new letter inventory.
//This new letter inventory will then handle all the size, count, and other computations itself.

//Subtracts the contents of the "other" LetterInventory from the
//Contents of the letter inventory that called the method.
//public LetterInventory subtract(LetterInventory other)
//Takes both LetterInventory's get() method for each index and subtracts the value, putting them into a new count array.
//If any of these elements is negative, return null. Otherwise, run through the new count array, creating a corresponding
//String as it itterates through. THis new string is then used as the data field to create a new LetterInventory object.