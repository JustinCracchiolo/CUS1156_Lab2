/* Project: Lab 2: Git
* Class: UniqueWords.java
* Author: Justin Cracchiolo
* Date: September 30th, 2014
* This program lists the number of unique
* words in a list.
*/
import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  boolean isUnique = true;
      for (int i = 0; i < list.size(); i++){
    	  isUnique = true;
    	  for (int j = 0; j < list.size(); j++){
    		  if(list.get(i).equals(list.get(j)) && j != i) {
    			  isUnique = false;
    			  break;
    		  }
    	  }
    	  if(isUnique) {
    		  count++;
    	  }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
