package com.lazaroalvarez.zookeeper;

public class TestZooKeeper {

	public static void main(String[] args) {
		Mammal someAnimal = new Mammal();
		someAnimal.displayEnergy();
		
		Gorilla someApe = new Gorilla();
		someApe.displayEnergy();
		someApe.climb();
		someApe.climb(2);
		someApe.throwBanana(2);
		someApe.eatBanana(5);
		someApe.throwBanana(8);
		
		Bat someBat = new Bat();
		someBat.displayEnergy();
		someBat.attackTown(2);
		someBat.eatHumans(2);
		someBat.fly(2);
	}

}
