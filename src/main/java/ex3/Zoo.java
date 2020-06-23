package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		this.aquarium = new Aquarium();
		this.fermeReptile = new FermeReptile();
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
	}
	
	public void addAnimal(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getType().equals("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getType().equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}
	

	/** Getter
	 * @return the savaneAfricaine
	 */
	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	/** Setter
	 * @param savaneAfricaine the savaneAfricaine to set
	 */
	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
