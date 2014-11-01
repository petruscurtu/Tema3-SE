package mta.se.tema3.plants;

import mta.se.tema3.interfaces.IBeing;

public abstract class Plant implements IBeing {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("the sun has gone down. The plant will sleep now");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The sun has come up. The plant will meak food now");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("The plant is breathing");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("The plant will die");
	}

	abstract void makeFlower();

	abstract void catchInsect();

}
