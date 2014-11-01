package mta.se.tema3.basic;

import mta.se.tema3.animals.CarnivorAnimal;
import mta.se.tema3.exceptions.NameException;
import mta.se.tema3.plants.CarnivorPlant;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CarnivorAnimal Ca = new CarnivorAnimal("lion");
		Ca.hunt();
		
		CarnivorPlant Cp=new CarnivorPlant("venus fly-trap");
		Cp.catchInsect();
		
		CarnivorPlant Cp2=new CarnivorPlant();
		Cp2.catchInsect();

		try {
			String nume = Ca.getName();
			if (nume == null)
				throw new NameException("Name was not initialised");
			else
				System.out.println("Animal named " + nume);
			
			nume = Cp.getName();
			if (nume == null)
				throw new NameException("Name was not initialised");
			else
				System.out.println("Plant named " + nume);
			
			nume = Cp2.getName();
			if (nume == null)
				throw new NameException("Name was not initialised");
			else
				System.out.println("Plant named " + nume);
		}

		catch (NameException ex) {
			ex.printmessage();
			String mesaj = ex.getMessage();
			System.out.println("Inherited method : "+mesaj);
		}
	}

}
