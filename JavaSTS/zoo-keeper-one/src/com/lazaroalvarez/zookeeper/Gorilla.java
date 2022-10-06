package com.lazaroalvarez.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}

	public void throwBanana() {
		this.setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Throws Banana!");
	}
	
	public void throwBanana(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() - (numberOfTimes*5));
		System.out.println("Throws alot of Bananas!\n Has " + this.getEnergyLevel() + " energy left.");
	}
	
	public void eatBanana() {
		this.setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Eats Banana.\n Has " + this.getEnergyLevel() + " energy left.");
	}
	
	public void eatBanana(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() + (numberOfTimes*10));
		System.out.println("Eats many Bananas!\n Has " + this.getEnergyLevel() +" energy left.");
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel() -10);
		System.out.println("Climbs higher. \n Has " + this.getEnergyLevel() + " energy left.");
	}
	
	public void climb(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() - (numberOfTimes*10));
		System.out.println("Climbs even higher. \n Has " + this.getEnergyLevel() + " energy left.");
	}
}
