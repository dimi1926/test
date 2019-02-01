package fr.test;

public class Hashcode {
	public static class Student {
		int id;
		String nom;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public Student(int id, String nom) {
			this.id = id;
			this.nom = nom;
		}

	}

	public static void main(String[] args) {
		Student alex1 = new Student(1, "Alex");
		Student alex2 = alex1;
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
	}

}
