package fr.eni.maxEtCompare;

import java.util.Scanner;

public class MaxEtCompare {

	static int valeur1;
	static int valeur2;
	static int valeurMax;

	public static void main(String[] args) {
		System.out.println("Entrez une valeur:");
		valeur1 = scannerInt();
		System.out.println("Entrez une seconde valeur:");
		valeur2 = scannerInt();
		max(valeur1, valeur2);
		System.out.println("La valeur la plus grande est : " + valeurMax);
		compare(valeur1, valeur2);
		if (valeur1 == valeur2) {
			System.out.println("les 2 valeurs ont égales");
		}
		if (valeur1 > valeur2) {
			System.out.println("La valeur '" + valeur1 + "' est la plus grande");
		} else {
			System.out.println("La valeur '" + valeur2 + "' est la plus grande");
		}
	}

	public static int compare(int valeur1, int valeur2) {
		if (valeur1 == valeur2) {
			return 0;
		}
		if (valeur1 > valeur2) {
			return 1;
		} else {
			return -1;
		}
	}

	public static int max(int valeur1, int valeur2) {
		if (valeur1 > valeur2) {
			valeurMax = valeur1;
		} else {
			valeurMax = valeur2;
		}
		return valeurMax;
	}

	public static int scannerInt() {
		Scanner scan = new Scanner(System.in);
		int saisie = scan.nextInt();
		return saisie;
	}
}
