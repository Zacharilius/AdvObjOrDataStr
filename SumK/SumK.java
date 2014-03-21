/*
 *	SumK finds if a number provided through the args variable can be added to in the array
 *	defined in the main class
 *
 */
public class SumK{
	/*
	 *	The main method for the SumK class. I initializes an array and formats sumK
	 *  recursive call.
	 *
	 *	It does not handle if a number is not inputted into the args method when started.
	 */
	public static void main(String[] args){
		int[] testArray = {1,3,5,7,9,11,13,14,17};
		int k = Integer.parseInt(args[0]);
		System.out.println("k: " + k);
		System.out.println("{1,3,5,7,9,11,13,14,17}");
		
		int[] output = sumK(0, testArray.length - 1, testArray, k);
		if(output != null){
			System.out.println("The numbers: " + output[0] + " & " + output[1] + " = " + k);
		}
		else{
			System.out.println("Sum not possible");
		}
		/*
		System.out.println(output.length);
		System.out.println("Here");
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(k);
		*/
	
	}
	/*
	 *	Recursively finds if the variable k has 2 elements in the array A that can be 
	 *	summed to equal k
	 *
	 *	@param	left	The left index of the array
	 *	@param	right	the right index of the array
	 *	@param	A 		The array to be searched
	 *	@param	k		The target value
	 *	 
	 *	@return			Returns an integer array with the 2 values that sum to k or null 
	 *					if one does not exist.
	 *
	 */
	public static int[] sumK(int left, int right, int[] A, int k){
		int l = A[left];
		int r = A[right];
		//System.out.println(l + ", " + r);
		if(left == right){
			return null;
		}
		else if(l + r == k){
			return new int[] {l,r};
		}

		else{
			if(l + r > k){
				return sumK(left, right - 1, A, k);
			}
			else if(l + r < k){
				return sumK(left + 1, right, A, k);
			}
		}
		return null;
	}

}