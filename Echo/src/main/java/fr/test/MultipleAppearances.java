package fr.test;

public class MultipleAppearances {

	public static void main(String[] args) {
		String text = "0123hello9012hello8901hello7890";
		String motATrouver = "h";
		
		

		maxApperances(text, motATrouver);

	}

	private static int maxApperances(String text, String motATrouver) {
		int index = text.indexOf(motATrouver);
		int matchLength = motATrouver.length();
		int counter=0;
		while (index >= 0) {  // indexOf returns -1 if no match found
		    System.out.println(index);
		    counter++;
		    index = text.indexOf(motATrouver, index + matchLength);
		}
	    System.out.println(counter);

		return counter;
	}

}
