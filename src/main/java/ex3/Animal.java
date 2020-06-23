/**
 * 
 */
package ex3;

import java.util.List;

/**Représente un animal du zoo
 * @author formation
 *
 */
public class Animal {
	
	private String type;
	private String nom;
	private String comportement;
	
	/** Constructeur
	 * @param type
	 * @param nom
	 * @param comportement
	 */
	public Animal(String nom, String type, String comportement) {
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return nom;
	}

	/** Getter
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** Getter
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
	/** Getter
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

}
