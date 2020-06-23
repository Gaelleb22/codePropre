/**
 * 
 */
package ex3;

import java.util.ArrayList;
import java.util.List;

/**Représente les différentes zones du zoo
 * @author formation
 *
 */
public abstract class ZoneDuZoo {
	
	private List<Animal> animals;

	/** Constructeur
	 * @param animals
	 */
	public ZoneDuZoo() {;
		this.animals = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animals){
			System.out.println(animal.getNom());
		}
	}

	@Override
	public String toString() {
		return animals.toString();
	}

	/** Getter
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}

	/** Setter
	 * @param animals the animals to set
	 */
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	

}
