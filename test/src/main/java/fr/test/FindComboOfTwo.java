package fr.test;

public class FindComboOfTwo {

	static int count(int n) {
		
		return (n * (n-1))/2;	
	}

	public static void main(String[] args) {
		FindComboOfTwo test = new FindComboOfTwo();
		
		System.out.println(test.count(5));

	}

}