import java.util.Scanner;

public class calculette {

	public static void main(String[] args) 
	{
		Scanner sc;
		sc = new Scanner(System.in); // est un objet
		System.out.print("Saisir un entier:");
		int value = sc.nextInt(); // est un réel
		// value= sc.nextInt(); //méthode de l'objet scanner
		
		System.out.println(value);
		
		System.out.print("Saisir un entier:");
		int value2 = sc.nextInt(); // est un réel
		int resultat= value + value2;
		System.out.println("La somme est :" + resultat);
		
		sc.close();
	}

}
