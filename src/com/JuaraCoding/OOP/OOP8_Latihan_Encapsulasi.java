package com.JuaraCoding.OOP;

class Player2{
	private String name;
	private int baseHealt;
	private Pelindung pelindung;
	private Senjata senjata;
	private int level;
	private int incrementHealth; //Jadi setiap naik level ada penambahan 20 untuk darah atau health
	private int baseAttack;
	//private Senjata senjata;
	private int incrementAttack; //Jadi setiap naik level ada penambahan attack
	private int totalDamage;
	
	public Player2 (String name){
		this.name=name;
		this.level=1;
		this.baseHealt = 100;
		this.baseAttack=100;
		this.incrementAttack=20;
		this.incrementHealth=20;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	void display () {
		System.out.println("Player Name \t: " + this.name);
		System.out.println("Level \t \t: " + this.level);
		System.out.println("MaxHealth \t: " + this.MaxHealth());
		System.out.println("Attack \t: " + this.getAttackPower() + "\n");
	}
	
	public void attack(Player2 opponent) {
		
		//Menghitung damage
		int damage= this.getAttackPower();
		//print event
		System.out.println( this.name + " Is attacking " + opponent.getName() + " with " + damage + " damage " );
		
	}
	
	public void defence (int damage) {
		int deltaDamage = damage - this.pelindung.getDefencePower();
	}
	
	private int getAttackPower() {
		return this.baseAttack + this.level*this.incrementAttack + this.senjata.getAttack();
	}
	
	private void setLevelUp() {
		this.level++;
	}
	
	public void setPelindung(Pelindung pelindung) {
		this.pelindung=pelindung;
	}
	
	public void setSenjata(Senjata senjata) {
		this.senjata=senjata;
	}
	
	public int MaxHealth(){
		return this.baseHealt +this.level*this.incrementHealth + this.pelindung.getAddHealth();
	}
	
	
	
}

class Senjata{
	private String name;
	private int attack;
	
	Senjata (String name, int attack ){
		this.name=name;
		this.attack=attack; 
	}
	
	public int getAttack() {
		return this.attack;
	}
}

class Pelindung {
	private String name;
	private int strength;
	private int health;
	
	public Pelindung (String name, int strength, int health) {
		this.name=name;
		this.strength=strength;
		this.health=health;
	}
	
	public int getAddHealth(){
		return this.strength*10 + this.health;
	}
	
	public int getDefencePower() {
		return this.strength*2;
	}
	
}

public class OOP8_Latihan_Encapsulasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player2 player1 =  new Player2 ("Zack");
		Pelindung pelindung1 = new Pelindung("Baju besi",5,100);
		Senjata senjata1= new Senjata("Pedang", 10);
		player1.setPelindung(pelindung1);
		player1.setSenjata(senjata1);
		
		Player2 player2 =  new Player2 ("Mr X");
		Pelindung pelindung2 = new Pelindung("Rompi Anti Peluru",51,100);
		Senjata senjata2= new Senjata("Golok", 15);
		player2.setPelindung(pelindung2);
		player2.setSenjata(senjata2);
		
		
		
		
		player1.display();
		System.out.println();
//		player1.setLevelUp();
//		player1.display();
		player2.display();
		player1.attack(player2);
	}

}
