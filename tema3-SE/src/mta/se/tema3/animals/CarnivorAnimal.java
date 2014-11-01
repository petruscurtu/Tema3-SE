package mta.se.tema3.animals;


public class CarnivorAnimal extends Animal {

	String name;
	
	public CarnivorAnimal() {
		super();
		this.name=null;
	}
	
	public CarnivorAnimal(String name){
		super();
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void reproduce() {
		System.out.println("This animal is searching for a partner");		
	}

	@Override
	public void hunt() {
		System.out.println("This animal is searching for a potentiall pray");
		
	}

	

}
