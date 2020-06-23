package ex3;

import java.util.List;

public class Aquarium extends ZoneDuZoo{
	
	public double calculerKgsNourritureParJour(){
		return super.getAnimals().size() * 0.2;
	}
}
