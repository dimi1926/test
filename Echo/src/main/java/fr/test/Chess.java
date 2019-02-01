package fr.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Chess {

	public static void main(String[] args) {
		ArrayList<String> jouers = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
		int rand = (int) Math.random();
		String jouerChoisi = jouers.get(rand * jouers.size());

		ArrayList<String> jouerReste = new ArrayList();
		int index = 0;

		for (String string : jouers) {
			if (rand * jouers.size() != index) {
				jouerReste.add(string);
			}
			index++;
		}

		System.out.println("jouer choisi: " + jouerChoisi + " et ceux qui reste sont: " + String.join(",", jouerReste)
				+ "\n" + "combos sont: " + count(jouers.size()));

	}

	static int count(int n) {
		return (n * (n - 1)) / 2;
	}

}
