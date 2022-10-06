package com.lazaroalvarez.zookeeper;

public class Mammal {
//  ---------- attributes (private/protected) -------------
	private int energyLevel;
	
//  ---------- constructors -------------	
	public Mammal() {
		this.energyLevel = 100;
	}	
	
	public void displayEnergy() {
		System.out.println("Current energy level: " + this.energyLevel);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}