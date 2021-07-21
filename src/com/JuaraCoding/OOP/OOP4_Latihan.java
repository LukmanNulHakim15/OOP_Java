package com.JuaraCoding.OOP;

//Player
class Player {
	String nama;
	double health;
	int level;
	
	Weapon weapon;
	Armor armor;
	
	Player(String nama, double health){
		this.nama = nama;
		this.health = health;
	}
	
	void Attack (Player player) {
		double AttackPower = this.weapon.AttackPower;
		System.out.println(this.nama + " Attacking " + player.nama + " with power " + this.weapon.AttackPower + " hp ");
		player.Defence(AttackPower);
	}
	
	void Defence (double AttackPower) {
		
		// Akan mengambil damage
		double DefencePower = this.armor.DefencePower;
		double damage;
		
		if (DefencePower < AttackPower) {
			damage= AttackPower - DefencePower;
		} else {
			damage=0;
		}
		this.health -= damage;	
		System.out.println(this.nama + " gets damage " + damage);
	}
	
	void equipWeapon (Weapon weapon) {
		this.weapon = weapon; 
	}
	
	void equipArmor (Armor armor) {
		this.armor = armor;
	}
	
	void equipPlayer () {
		System.out.println("Nama : " + this.nama);
		System.out.println("Health : " + this.health + " hp");
	
	}
}

//Senjata
class Weapon{
	String nama;
	double AttackPower;
		
	Weapon(String nama, double AttackPower){
		this.nama = nama;
		this.AttackPower = AttackPower;
	}
	
	public void equipPlayer() {
		// TODO Auto-generated method stub
		
	}

	void display() {
		System.out.println("Weapon : " + this.nama + " , Attack : " + this.AttackPower);
	}
}

//Armor
class Armor{
	String nama;
	double DefencePower;
	
	Armor (String nama, double DefencePower){
		this.nama = nama;
		this.DefencePower = DefencePower;	
	}
	
	public void equipPlayer() {
		// TODO Auto-generated method stub
		
	}
	
	void showArmor () {
		System.out.println("Armor : " + this.nama + " , Defence : " + this.DefencePower);
	}
}

public class OOP4_Latihan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Membuat object palyer
		
		Player player1 = new Player("Otong", 100);
		Player player2 = new Player("Nunik", 50);
		// Membuat object weapon
		
		Weapon weapon1 = new Weapon ("Pedang", 35);
		Weapon weapon2 = new Weapon ("Celurit", 10);
		// Membuat object armor
		
		Armor armor1 = new Armor ("Rompi", 10);
		Armor armor2 = new Armor ("Baju Besi", 0);
		//Equip dan armor
		// Player 1
		
		player1.equipPlayer();
		player1.equipWeapon(weapon1);
		player1.equipArmor(armor1);		
		player1.weapon.display();
		player1.armor.showArmor();
		
		System.out.println("");
		// Player 2
		player2.equipPlayer();
		player2.equipWeapon(weapon2);
		player2.equipArmor(armor2);
		player2.weapon.display();
		player2.armor.showArmor();
		
		System.out.println("\nPertarungan");
		System.out.println("\nEpisode 1\n");
		player1.Attack(player2);
		System.out.println();
		player1.equipPlayer();
		player1.equipWeapon(weapon1);
		player1.equipArmor(armor1);		
		player1.weapon.display();
		player1.armor.showArmor();
		
		System.out.println("");
		// Player 2
		player2.equipPlayer();
		player2.equipWeapon(weapon2);
		player2.equipArmor(armor2);
		player2.weapon.display();
		player2.armor.showArmor();
		
		
		System.out.println("\nEpisode 2\n");
		player2.Attack(player1);
		System.out.println();
		player1.equipPlayer();
		player1.equipWeapon(weapon1);
		player1.equipArmor(armor1);		
		player1.weapon.display();
		player1.armor.showArmor();
		
		System.out.println("");
		// Player 2
		player2.equipPlayer();
		player2.equipWeapon(weapon2);
		player2.equipArmor(armor2);
		player2.weapon.display();
		player2.armor.showArmor();
		
		
	}

}
