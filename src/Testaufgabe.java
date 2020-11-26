import java.util.*;
import java.io.*;


class Testaufgabe {
	
	public static int calcVal(String name, int pos) {
		int sum = 0, value = 0;
		
		char[] chars = name.toCharArray();						//turn every string into characters
			
		for (char c : chars) 
			sum += c - 64;										//get the ASCII value of the character and minus 64 because A has the ASCII value of 65. According to the exercise A has the value of 1 (65 - 64 = 1)	

		value = sum * (pos + 1);								//the sum of word value multiplies with the position value i. (+1) because for the first name i will be 0
		
		return value;
	}
	 
	public static void main(String[] args) throws FileNotFoundException {
		
		String text = new String();
		String[] nameArray;										//array for the names
		
		Scanner file = new Scanner(new File("names.txt"));		//read the text file names.txt
		
		while(file.hasNextLine()) {								//if the file is available, save it in the variable text
			text = file.nextLine();
		}
		

		nameArray = text.replace("\"", "").split(",");			//remove " from the text as well as turn the string to an array
		Arrays.sort(nameArray);									//sort the array alphabetically
		
		
		int[] value = new int[nameArray.length];				//create an array that stores the value of position value multiplies with word value
		
		for(int i = 0; i < nameArray.length; i++) {
			
			value[i] = calcVal(nameArray[i], i);
			System.out.println("" + (i + 1) + ": Total sum of the name " +  nameArray[i] + " is " + value[i]);
		}
		
		file.close();
		
	}

}

