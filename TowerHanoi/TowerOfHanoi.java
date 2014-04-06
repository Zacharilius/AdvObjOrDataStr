import java.util.Stack;
/**
 *	Tower of Hanoi implementation 
 */
public class TowerOfHanoi{
	/*
	 *	Main method for the Tower of Hanoi implementation
	 *
	 *	@param	args	A string array for the main method
	 *
	 */
	public static void main(String[] args){
		System.out.println(move(6, 'a', 'c', 'b'));
	
	}
	/*
	 *	Recursively finds and prints the quickest route moving disks from 1 
	 *
	 *	@param	n		The number of disks in the orig position
	 *	@param	orig	The original stack
	 *	@param	dest 	The destination stack
	 *	@param	temp	The temporary stack used to switch the disks from orig to dest.
	 *	 
	 *	@throw			IllegalArgumentException() cannot have negative stacks
	 *
	 *	@return			A string that records the switching from stack to stack. 
	 *
	 */
	public static String move(int n, char orig, char dest, char temp){
 
		String swap = "Disk " + n + ": " + "swapped from " + orig + " to " + dest + "\n";
			//"Move disk " + n + " from " + orig + " to " + dest + "\n";
	 
		if( n <= 0 ){
			throw new IllegalArgumentException();
		}
   
		if( n == 1 ){
			return swap;
		}
		String output = move( n - 1, orig, temp, dest );
		output += swap;
		output += move( n - 1, temp, dest, orig );
	 
		return output;
 
	}

}