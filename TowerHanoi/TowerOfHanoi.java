import java.util.Stack;
public class TowerOfHanoi{
	public static void main(String[] args){
		System.out.println(move(3, 'a', 'c', 'b'));
	
	}

	public static String move(int n, char orig, char dest, char temp){
 
		String moveLog =
			"Move disk " + n + " from " + orig + " to " + dest + "\n";
	 
		if( n <= 0 ){
			throw new IllegalArgumentException();
		}
   
		if( n == 1 ){
			return moveLog;
		}
		String result = move( n - 1, orig, temp, dest );
		result += moveLog;
		result += move( n - 1, temp, dest, orig );
	 
		return result;
 
	}

}