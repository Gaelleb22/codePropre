package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;
	

	/** Constructeur utilis� pour cr�er un un compte de type Livret A
	 * @param type = LA
	 * @param solde repr�sente le solde du compte
	 * @param decouvert  repr�sente le d�couvert autoris�
	 * @param tauxRemuneration  repr�sente le taux de r�mun�ration du livret A
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
	 * M�thode qui retourne la r�mun�ration annuelle en fonction du solde
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
