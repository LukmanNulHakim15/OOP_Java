package com.JuaraCoding.OOP;

class Pemain {
	String name; //default, dia akan bisa dibaca dan ditulis dari luar class
	public int experience; //public, dia akan bisa dibaca dan ditulis dari luar class
	private int health; //private, dia hanya bisa dibaca dan ditulis dari dalam class
	
	Pemain (String name, int experience, int health){
		this.name = name;
		this.experience = experience;
		this.health = health;
	}
	
	//Membuat method default
	void display() {
		tambahExp(); //cara memanggil method private
		System.out.println("\nName: " + this.name);
		System.out.println("Experience: " + this.experience);
		System.out.println("health: " + this.health);
	}
	
	//Membuat method public
	public void setName(String nameBaru) {
		this.name = nameBaru;
	}
	
	//Membuat method private
	private void tambahExp () {
		this.experience += 100;
	}
}

public class OOP6_PublicAndPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pemain pemain1 = new Pemain ("Budi", 100, 100);
		
		//default
		System.out.println(pemain1.name); //Disebut membaca data
		pemain1.name = "Axel";// Disebut menulis data
		System.out.println(pemain1.name);
		
		//public
		System.out.println();
		System.out.println(pemain1.experience); //Disebut membaca data
		pemain1.experience = 300;// Disebut menulis data
		System.out.println(pemain1.experience);
		
		//private
//		System.out.println();
//		System.out.println(pemain1.health); //Disebut membaca data
//		pemain1.health = 300;// Disebut menulis data
//		System.out.println(pemain1.health);// Tidak bisa di akses karna private
		
		//Pemanggilan method default
		pemain1.display();
		
		//Pemanggilan method public
		pemain1.setName("Surti");
		pemain1.display();
		
		//Pemanggilan method private
//		pemain1.tambahExp(); // tidak bisa dipanggil karna method private
	}

}
