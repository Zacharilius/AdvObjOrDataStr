import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/**
 * 
 */
public class MM {
	public static void main(String[] args){
		//Input files from current directories
		ArrayList<String> arrayListA = inputFile("matrixA.txt");
		ArrayList<String> arrayListB = inputFile("matrixB.txt");

		//Parse file a into 2d array
		int colA = getCols(arrayListA);
		int[][] matrixA = new int[arrayListA.size()][colA];
		matrixAdd(arrayListA, matrixA);
		
		//Parse file b into 2d array
		int colB = getCols(arrayListB);
		int[][] matrixB = new int[arrayListB.size()][colB];
		matrixAdd(arrayListB, matrixB);

		//Multiply array
		int[][] matrixC = matrixMultiplication(matrixA, matrixB);
		System.out.println(toString(matrixA));
		System.out.println(toString(matrixB));
		System.out.println(toString(matrixC));
		
		//Save to file c		
		outputFile(toString(matrixC));
	}
	public static ArrayList<String> inputFile(String fileName){
		ArrayList<String> arrayListLines = new ArrayList<>();
		String line = "";
		
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while((line = in.readLine()) != null){
                arrayListLines.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("inputFile() ERROR");
        }
        finally {
            return arrayListLines;
        }
	}
    public static int getCols(ArrayList<String> fileA) {
        int cols = 0;
        int currRowCols;
        for(int i = 0; i < fileA.size(); i++){
            currRowCols = 0;
            String currRow = fileA.get(i);
            for(int j = 0; j < currRow.length(); j++){
                char c = currRow.charAt(j);
                if(c == ' '){
                }
                else if(c == '-'){                   
                }
                else if(c >= '0' && c <= '9'){
                    currRowCols++;
                }
            }
            //Check if cols change from previous
            if (cols == 0){
                cols = currRowCols;
            }
        }
        return cols;
    }	
    /**
     * Parses the array from a specified file into a 2d array
     * @param stringMatrix The string array matrix to be parsed into a 2d array
     */
    public static void matrixAdd(ArrayList<String> arrayList, int[][] intMatrix){
    	int row = 0;	
    	while(row < arrayList.size()){
    		int col = 0;
    		int pos = 0;
    		String line = arrayList.get(row);
    		while(pos < line.length()){
    			String addNumber = "";
    			boolean cont = true;
    			while(cont && pos < line.length()){ //...quick fix to prevent string out of bounds exceptions
    				char c = line.charAt(pos);
					switch(c){
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
						case '-':
							addNumber += Character.toString(line.charAt(pos));
							break;
						default:
							cont = false;
					}
					pos++;
        		}
        		intMatrix[row][col] = Integer.parseInt(addNumber); 		
        		col++;
    		}
    		row++;
    	}   
    }
    
    public static int[][] matrixMultiplication(int[][] matrixA, int[][] matrixB){
    	int mA = matrixA.length;
    	int nA = matrixA[0].length;
    	int mB = matrixB.length;
    	int nB = matrixB[0].length;
    	
    	if(nA != mB) throw new RuntimeException("ERROR: Incorrect matrix dimensions");
		int[][] matrixC = new int[mA][nB];
		for(int i = 0; i < mA; i++){
			for(int j = 0; j < nB; j++){
				for(int k = 0; k < matrixB.length; k++){
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
    		}
    	}
    	return matrixC;	
    }  
    public static String toString(int[][] matrix){
    	String outputString = "";
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0; j < matrix[i].length; j++){
    			outputString += matrix[i][j] + " ";
    		
    		}
    		outputString += "\n";
    	}
    	
    	
    	return outputString;
    
    }
    public static void outputFile(String matrixC){
        PrintWriter out = null;
        try {
            out = new PrintWriter("matrixAnswer.txt");
            out.print(matrixC);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MM.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }	
}