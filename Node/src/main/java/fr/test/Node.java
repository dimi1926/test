package fr.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {

	Node left, right;
	int value;

	public Node find(int v) {
		Node node = this;

		while (node != null && node.value != v) {
			if (v < node.value) {
				node = node.left;
			} else
				node = node.right;
		}
		return node;
	}

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3 };
		List<Integer> list =  Arrays.asList(arr);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		System.out.println(list.size());
		System.out.println(list2.size());

		list2.retainAll(list);
		System.out.println(list2.get(0));

	}

}