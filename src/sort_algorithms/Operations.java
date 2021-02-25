package sort_algorithms;
import java.io.*;
/**
 *
 * @author Yerson, Danielaa, Sergio, Diego
 */
public class Operations {
    
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );    
          
    public int[] readArrayFronConsole()throws IOException	
        {        
        String[] numbers = br.readLine().split(",");//creation of numbers array
        int[] arrayNumbers = new int[numbers.length];     
	    for(int i = 0; i < numbers.length; i++)
		arrayNumbers[i] = Integer.parseInt( numbers[i] );
                
            return arrayNumbers;	
	}
    public void printArray(int[] array)throws IOException
	{
	bw.write("\nLa cadena ordenada es: ");	
	for(int i = 0; i < array.length - 1; i++)//number array writing
            bw.write(array[i] + ",");
                bw.write(array[array.length - 1] + "\n");
                    bw.flush();		
	}       
    
}
