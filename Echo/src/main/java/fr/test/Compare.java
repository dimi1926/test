package fr.test;

public class Compare {
	final static Integer[] numbers = { 1, 4, 3, 4, 2, 6 };
	final static Integer[] colors = { 0x50, 0x34, 0x00, 0xfe, 0xff, 0xff };

	public int compare(Integer a, Integer b) {
		return numbers[b] - numbers[a];
	}

	public static void main(String[] args) {
		Integer[] sortedNumbers = new Integer[numbers.length];
		Compare compare = new Compare();
		for (int i = 0; i < numbers.length - 1; i++) {
			//compare.compare(numbers[i + 1], numbers[i]);
			System.out.println(compare.compare(numbers[i ], numbers[i+1]));
		}

	}

}