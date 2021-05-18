package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jeu_des_capitales {

	public static void main(String[] args) {
		
		final int NB_DE_PAYS = 10;
		int index, score = 0;
		String pays, capitale, réponse;
		char rejouer;
		
		ArrayList<Integer>index_deja_pris = new ArrayList<>();
		
		
		String [][] Pays = {
				{"Algérie", "Alger"},
				{"Allemagne", "Berlin"},
				{"France", "Paris"},
				{"Autriche", "Vienne"},
				{"Brésil", "Brasilia"},
				{"Chine", "Pékin"},
				{"Egypte", "Le caire"},
				{"Belgique", "Bruxelle"},
				{"Etat Unis", "Washington"},
				{"Espagne", "Madrid"},		
				
		};
		
		Scanner clavier = new Scanner(System.in);
		
		do {index_deja_pris.clear();
			for (int i = 0; i < NB_DE_PAYS; i++) {
			
			do {
			Random random = new Random();
			index = random.nextInt(Pays.length);
			} while(index_deja_pris.contains(index));
			
			index_deja_pris.add(index);
			
			
			
			pays = Pays[index][0];
			capitale = Pays[index][1];
			
			System.out.printf("Quelle est la capitale de ce pays : %s?\n", pays);
			réponse = clavier.nextLine();
			
			if (réponse.equalsIgnoreCase(capitale)) {
				System.out.println("Bonne réponse !!!");
				score++;
				
			} else {
				System.out.printf("Mauvaise réponse, il fallait répondre %s\n", capitale);

			}
				
		}
		System.out.println("Votre score est de " + score + "/" + NB_DE_PAYS);
		
		do {
			System.out.println("Voulez vous rejouer ? O / N");
			rejouer = clavier.nextLine().toLowerCase().charAt(0);
		} while	(rejouer != 'o' && rejouer != 'n');
		
		} while (rejouer == 'o');
		System.out.println("Merci d'avoir jouer, a bientot !!");
		System.out.println("Appuyer sur entrer pour quitter");
		clavier.nextLine();
		clavier.close();
		
			
		} 
		
		

	} 


