package pkg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		ArrayList<Item> menu = new ArrayList<Item>();
		double montantTotal = 0; 
		Command c1 = new Command();
		
		//gets the number of entree in our command
		//int s = c1.getEntree(1); 

		try {
			// création du fichier dans le Rep pour écrire dedant avec le chemin absolut(attention sensitive)
				FileWriter fileWriter = new FileWriter("C:/Users/SahlouneB/Desktop/Read/fichier.txt");
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Bonjour bienvenu au FMS-RESTO, combien de menus souhaitez-vous ?");
				
				int value = checkScan(scan,"Erreur ce n'est pas chiffre");
				int counterCommande = 0;
				
				while(value > 0) {
				
				counterCommande++;
				value--;
				System.out.println("Que souhaitez-vous comme entreé ? [Saisir le chiffre correspondnant]");
				System.out.println(c1.getAllEntree());
				int valueEntree = checkScan(scan,"Erreur ce n'est pas chiffre");
				//record for menu listItem
				menu.add(c1.getEntree(valueEntree - 1));
				double priceEntre = c1.getEntree(valueEntree - 1).getPrice();
				montantTotal += priceEntre; 
				
				System.out.println("Que souhaitez-vous comme plats ? [Saisir le chiffre correspondnant]");
				System.out.println(c1.getAllPlats());
				int valuePlats = checkScan(scan,"Erreur ce n'est pas chiffre");
				menu.add(c1.getPlats(valuePlats - 1));
				double priceplats = c1.getPlats(valuePlats - 1).getPrice();
				montantTotal += priceplats;
				
				System.out.println("Que souhaitez-vous comme accompagnement ? [Saisir le chiffre correspondnant]");
				System.out.println(c1.getAllAccompagnement());
				int valueAccompagnement = checkScan(scan,"Erreur ce n'est pas chiffre");
				menu.add(c1.getAccompagnement(valueAccompagnement - 1));
				double priceAcommpagnement = c1.getAccompagnement(valueAccompagnement - 1).getPrice();
				montantTotal += priceAcommpagnement;
				
				System.out.println("Que souhaitez-vous comme boissons ? [Saisir le chiffre correspondnant]");
				System.out.println(c1.getAllboissons());
				int valueBoisson = checkScan(scan,"Erreur ce n'est pas chiffre");
				menu.add(c1.getBoissons(valueBoisson - 1));
				double priceBoisson = c1.getBoissons(valueBoisson - 1).getPrice();
				montantTotal += priceBoisson;
				
				System.out.println("Que souhaitez-vous comme desserts ? [Saisir le chiffre correspondnant]");
				System.out.println(c1.getAllDesserts());
				int valueDessert = checkScan(scan,"Erreur ce n'est pas chiffre");
				menu.add(c1.getDesserts(valueDessert - 1));
				double priceDessert = c1.getDesserts(valueDessert - 1).getPrice();
				montantTotal += priceDessert;
				System.out.println("******Commande numéro "+counterCommande+"***********");
				bufferWriter.write("******Commande numéro "+counterCommande+"***********");
//				for(Item i : menu) {
//					System.out.print(i.getName()+ " ");
//					// on écrit et on  rajoute au fichier 
//					bufferWriter.write("\n"+i.getName()+ "\n");
//					
//					
//				}
				}
				for(Item i : menu) {
					System.out.print(i.getName()+ " ");
					// on écrit et on  rajoute au fichier 
					bufferWriter.write("\n"+i.getName()+ "\n");
						
					
				}
				System.out.println(" ");
				bufferWriter.write("\n"+"Montant Total:" +montantTotal+ "€\n");
				System.out.println("");
				System.out.println("Montant totale "+ montantTotal+" €\n");
				bufferWriter.close();
			}catch(IOException e) {
				System.out.println("Error");
				
		}
		

	}
	
	// Méthode pour tester si on entre un chiffre 
	public static int checkScan(Scanner scan,  String promptOnError) {
		
		// Tant que c'est pas un chiffre on boucle 
		while(!scan.hasNextInt()) {
			System.out.println(promptOnError);	
			// Important : il faut vider le SCAN incorrect sinon boucle infinyty
			scan.nextLine();
		}
		int input = scan.nextInt();	
		scan.nextLine(); // On vide le buffer
		return input; 
	}



}
