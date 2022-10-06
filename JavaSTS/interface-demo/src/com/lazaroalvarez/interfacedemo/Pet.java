package com.lazaroalvarez.interfacedemo;

public class Pet {

		//attributes
		protected String name;
		protected String type;
		
		//constructors
		public Pet() {
			this.name = "Random Pet";
		}
		
		public Pet(String name) {
			this.name = name;
		}
		
		public Pet(String name, String type) {
			this.name = name;
			this.type = type;
		}

		//other methods
		//		@Deprecated
		public void displayStatus() {
			System.out.println("Name: " + this.name);
			System.out.println("type: " + this.type);
		}
		
		//getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	

}
