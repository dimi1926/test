package fr.test;

public class Main1 {

	public static void main(String[] args) {
		long s = 3L; // changez cette valeur pour tester d'autres cas
		Monnaie m = MonnaieSolution.monnaieOptimale(s);

		System.out.println("Pi�ce(s)   2� : " + m.piece2);
		System.out.println("Billet(s)  5� : " + m.billet5);
		System.out.println("Billet(s) 10� : " + m.billet10);

		long resultat = m.piece2 * 2 + m.billet5 * 5 + m.billet10 * 10;
		System.out.println("\nMonnaie rendue = " + resultat);
	}

}
