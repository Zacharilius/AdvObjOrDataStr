/**
 * @author Zachary Bensley
 * @date 1/27/2014
 */
 public class Kill2{
 	/**
 	 *
 	 *
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