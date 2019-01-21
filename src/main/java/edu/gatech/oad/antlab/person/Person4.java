package edu.gatech.oad.antlab.person;
<<<<<<< HEAD
import java.lang.StringBuilder;
=======
>>>>>>> Initial commit

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
<<<<<<< HEAD
      StringBuilder answer = new StringBuilder();
      for (int i = 0; i < input.length(); i++) {
          if (Character.isLetter(input.charAt(i))) {
              int ascii = (int) input.charAt(i);
              int ascii2 = ascii + 1;
              answer.append(Character.toString((char) ascii2));
          } else {
              answer.append(input.charAt(i) - 47);
          }
      }
      return answer;
=======
      return null;
>>>>>>> Initial commit
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

}
