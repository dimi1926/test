package fr.test;

public class FindLargest {

	static int findLargest(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 10 && numbers[i] <= 100) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { };

		FindLargest test2 = new FindLargest();
		System.out.println(test2.findLargest(arr));
	}

}
