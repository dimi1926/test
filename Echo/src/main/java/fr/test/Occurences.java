package fr.test;

import java.util.ArrayList;
import java.util.List;

public class Occurences {

	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {
		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	static int getMaxAppearnces(String phrase, String caractere) {
		int index = phrase.indexOf(String.valueOf(caractere));
		int matchLength = String.valueOf(caractere).length();
		int counter=0;
		while (index >= 0) {  // indexOf returns -1 if no match found
		    System.out.println(index);
		    counter++;
		    index = phrase.indexOf(caractere, index + matchLength);
		}
	    System.out.println(counter);

		return counter;

	}

	// Driver Method
	public static void main(String[] args) {
		String str = "sample string";
		char car = getMaxOccuringChar(str);
		System.out.println("Max occurring character is " + car);
		System.out.println("Nulber of appereances is " + getMaxAppearnces(str, String.valueOf(car)));
	}
}
