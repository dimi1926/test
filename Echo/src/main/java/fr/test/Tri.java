package fr.test;

import java.util.ArrayList;

public class Tri {
//	i <- 0, j <- 0
//	repeat while i < length(arr1) and j < length(arr2):
//	    if arr1[i] > arr2[j]: increase j
//	    else if arr1[i] < arr2[j]: increase i
//	    else : output arr[i], increase both pointers
	static int i, j = 0;

	ArrayList<Double> tri(double[] x, double[] y) {
		ArrayList<Double> trie = new ArrayList<Double>();
		while (i < x.length && j < y.length) {
			if (x[i] > y[j]) {
				//System.out.println(x[i]);

				j++;
			} else if (x[i] < y[j]) {
				//System.out.println(x[i]);

				i++;
			} else {
				trie.add(x[i]);
				System.out.println(x[i]);
				i++;
				j++;

			}
		}

		return trie;

	}

	public static void main(String[] args) {
		double[] x = { 0.0, 1.0, 2.0, 4.0, 5.0, 6.0 };
		double[] y = { -3.0, 0.0, 4.0, 6.0, 10.0, 25.0 };
		ArrayList<Double> trie = new Tri().tri(x, y);
		System.out.println(trie.size());

		for (int i = 0; i < trie.size(); i++) {
			//System.out.println(trie.get(i));

		}

	}

}
