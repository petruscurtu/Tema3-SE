package mta.se.tema3.animals;

import mta.se.tema3.interfaces.IBeing;

public abstract class Animal implements IBeing {

	@Override
	public void sleep() {
		System.out.println("The animal will go to sleep");

	}

	@Override
	public void eat() {
		System.out.println("The animal will now eat");

	}

	@Override
	public void breathe() {
		System.out.println("The animal is breathing");
	}

	@Override
	public void die() {
		System.out.println("The animal will die");

	}

	abstract void reproduce();

	abstract void hunt();

}
