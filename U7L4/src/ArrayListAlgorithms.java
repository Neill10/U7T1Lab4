import java.util.ArrayList;

public class ArrayListAlgorithms
{
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for(String i : stringList)
        {
            if(i.equals(target))
            {
                return true;
            }
            for(int x = 0; x < i.length();x++)
            {
                int length = target.length();
                if(length + x < i.length()) {
                    String str = i.substring(x, x + length);
                    if(str.equals(target))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double sum = 0;
        for(int i : intList)
        {
            sum = sum + i;
        }
        double average = sum / intList.size();
        int count = 0;
        for(int i = 0; i < intList.size();i++)
        {
            if(intList.get(i)<average)
            {
                count++;
            }
        }
        return count;
    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList)
    {
        for ( int i = 0 ; i < wordList.size();i++)
        {
            int idx = wordList.get(i).length();
            String last = wordList.get(i).substring(idx - 1,idx);
            String upper = wordList.get(i);
            if(last.equals("s"))
            {
                upper = upper.toUpperCase();
            }
            wordList.remove(i);
            wordList.add(i,upper);
        }
    }

    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int minimum = intList.get(0);
        for(int i = 0; i < intList.size();i++) {
            int count = 0;
            for (int x = 0; x < intList.size();x++) {
                if(x != i)
                {
                    if(intList.get(x) == intList.get(i))
                    {
                        count++;
                    }
                }
            }
            if(count < minimum)
            {
                minimum = intList.get(i);
            }
        }
        return minimum;
    }
}
