package pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Command {
	
	private static int countCommand; 
	private int idCommand; 
	private ArrayList<Item> entree = new ArrayList<Item>();  
	private ArrayList<Item> plats = new ArrayList<Item>();  
	private ArrayList<Item> accompagnement = new ArrayList<Item>();  
	private ArrayList<Item> boissons = new ArrayList<Item>();  
	private ArrayList<Item> desserts = new ArrayList<Item>();  
	
	public Command() {
		populateMenu();
	}
	
	//return a spécific entree
	public Item getEntree(int index) {
		return entree.get(index);
	}
	public Item getPlats(int index) {
		return plats.get(index);
	}
	public Item getAccompagnement(int index) {
		return accompagnement.get(index);
	}
	public Item getBoissons(int index) {
		return boissons.get(index);
	}
	public Item getDesserts(int index) {
		return desserts.get(index);
	}
	public String getAllAccompagnement() {
		String accompagnementString = "";
		accompagnementString += "ACCCOMPAGNEMENT: \n";
		for(int i=0; i < accompagnement.size(); i++) {
			Item e = accompagnement.get(i);
			accompagnementString += e.toString() + "\n";
		}
		return accompagnementString;
	}
	public String getAllPlats() {
		String platString = "";
		platString += "PLATS: \n";
		for(int i=0; i < plats.size(); i++) {
			Item e = plats.get(i);
			platString += e.toString() + "\n";
		}
		return platString;
	}
	public String getAllEntree() {
		String entreeString = "";
		entreeString += "ENTREE: \n";
		for(int i=0; i < entree.size(); i++) {
			Item e = entree.get(i);
			entreeString += e.toString() + "\n";
		}
		return entreeString;
	}
	public String getAllboissons() {
		String boissonsString = "";
		boissonsString += "BOISSONS: \n";
		for(int i=0; i < boissons.size(); i++) {
			Item e = boissons.get(i);
			boissonsString += e.toString() + "\n";
		}
		return boissonsString;
	}
	public String getAllDesserts() {
		String dessertsString = "";
		dessertsString += "DESSERTS: \n";
		for(int i=0; i < desserts.size(); i++) {
			Item e = desserts.get(i);
			dessertsString += e.toString() + "\n";
		}
		return dessertsString;
	}
	
	public void populateMenu() {
		
		//entree
		entree.add(new Item("1=Salade", 3));
		entree.add(new Item("2=Soupe", 2));
		entree.add(new Item("3=Quiche", 4));
		entree.add(new Item("0=Aucun", 0));
		
		//plats
		plats.add(new Item("1=Poulet", 3));
		plats.add(new Item("2=Boeuf", 4));
		plats.add(new Item("3=Poisson", 5));
		plats.add(new Item("4=Vegétarien", 3));
		//accompagnement
		accompagnement.add(new Item("1=Riz", 3));
		accompagnement.add(new Item("2=Pates", 2));
		accompagnement.add(new Item("3=Frites", 4));
		accompagnement.add(new Item("4Légumes", 2));
		//boissons
		boissons.add(new Item("1=Eau plate", 3));
		boissons.add(new Item("2=Eau gazeuze", 2));
		boissons.add(new Item("3=Soda", 2));
		//desserts
		desserts.add(new Item("1=Tarte maison", 3));
		desserts.add(new Item("2=Mousse au choclat", 2));
		desserts.add(new Item("3=Tiramisu", 2));
		
	}
	
	
	
	
	
	
	public int getIdCommand() {
		return idCommand;
	}
	public void setIdCommand(int idCommand) {
		this.idCommand = idCommand;
	}
	
	public String addCommand() {
		Scanner scan = new Scanner(System.in);
		String c1 ="string";
		
		HashMap<Integer, String> entree =  new HashMap<Integer, String>();
		System.out.println("Choix Entreé: ");
		entree.put(3, "SALADE"); 
		entree.put(4, "SOUPE");
		entree.put(3, "QUICHE");
		entree.put(0, "AUCUNE");
		
		System.out.println(entree);
		System.out.println("Que souhaitez-vous comme entreé ? [Saisir le chiffre correspondnant]"); 
		int value = checkScan(scan,"Erreur ce n'est pas chiffre");
		for(int i: entree.keySet()) {
			if(i == value) {
				//System.out.println(entree.get(i))
				// teste à gérer pour ne pas afficher "aucun".
				 c1 = entree.get(i);
				
			}
		}
		return c1; 
	}

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
