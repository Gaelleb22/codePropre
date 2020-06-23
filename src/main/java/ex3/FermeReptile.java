package ex3;

import java.util.List;

public class FermeReptile extends ZoneDuZoo{

	public double calculerKgsNourritureParJour(){
		return super.getAnimals().size() * 10;
	}

}
