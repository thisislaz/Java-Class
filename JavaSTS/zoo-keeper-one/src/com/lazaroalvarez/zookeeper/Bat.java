package com.lazaroalvarez.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() - (numberOfTimes*50));
		System.out.println("Sreechs, flies off!!!\n Has " + this.getEnergyLevel() + " energy left.");
	}

	public void eatHumans(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() + (numberOfTimes*25));
		System.out.println("Eats humans.\n Has "+this.getEnergyLevel()+" energy left.");
	}
	
	public void attackTown(int numberOfTimes) {
		this.setEnergyLevel(getEnergyLevel() - (numberOfTimes*100));
		System.out.println("*Town burns to the groud*\n Has "+ this.getEnergyLevel() +" energy left.");
	}
}
