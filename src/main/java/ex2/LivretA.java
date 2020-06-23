package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	

	/** Constructeur utilisé pour créer un un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
		super.setType("LA");
	}
	
	@Override
	public void debiterMontant(double montant) {
		if (super.getSolde() - montant > 0) {
			super.setSolde(getSolde()- montant);
		}
	}
	
	/**
	 * Méthode qui retourne la rémunération annuelle en fonction du solde
	 * 
	 */
	public void appliquerRemuAnnuelle() {
		super.setSolde(getSolde()+getSolde()*tauxRemuneration / 100);
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
