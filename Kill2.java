/**
 * This class removes the second letter in the user inputted string
 *
 * @author Zachary Bensley
 * @date 1/27/2014
 * @version Java 7
 */
 public class Kill2{
 	/**
 	 * This is the main method for Kill2. It removes the second letter from 
 	 * the user inputted string. If the string is not 2 letters long, an 
 	 * error message is printed notify the user. If a user enters multiple 
 	 * strings through the args variable, the program only removes the 
 	 * second letter of the first string.
 	 *
 	 * @param args The user enters 1 value, a string. This string
 	 */
 	public static void main(String[] args){
 		if(args.length >= 1){
 			System.out.println(removeSecondLetter(args[0]));
 		}
 		else{
 			System.out.println("You entered an empty array");
 		}
 	}
 	private static String removeSecondLetter(String s){
 		if(s.length() < 2){
 			return "ERROR: Not enough letters in inputted string: " + s;
 		}
 		StringBuilder stringBuild = new StringBuilder(s);
 		return stringBuild.deleteCharAt(1).toString();
 		
 	}
 }