package mta.se.tema3.plants;

public class CarnivorPlant extends Plant {
	
	private String name;
	
	public CarnivorPlant() {
		super();
		this.name=null;
	}
	
	public CarnivorPlant(String name){
		super();
		this.name=name;
	}

	@Override
	public void catchInsect() {
		System.out.println("This plant atempts to catch insects");
	}

	@Override
	public void makeFlower() {
		System.out.println("This plant doesn't make any flowers");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
