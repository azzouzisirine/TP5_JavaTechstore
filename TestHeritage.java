package heritage;

public class TestHeritage {
	
	public static void main(String[] args) {
		/*
		Adulte a1 = new Adulte("Amine", 35, "Ingénieur");
		a1.afficherIdentite();
		Enfant e1 = new Enfant("Sami", 10, "École primaire");
		Bebe b1 = new Bebe("Lina", 1, true);
		System.out.println(a1);
		System.out.println(e1);
		System.out.println(b1);
		TypePersonne type = TypePersonne.ADULTE;

		System.out.println(type);

		for (TypePersonne t : TypePersonne.values()) {
		    System.out.println(t);
		}*/
		SystemeExploitation s1 = SystemeExploitation.Windows;
		SystemeExploitation s2 = SystemeExploitation.Ubuntu;
		System.out.println(s1);
		System.out.println(s2);
		for (SystemeExploitation s : SystemeExploitation.values()) {
		    System.out.println(s);
		}
		}

	
}
