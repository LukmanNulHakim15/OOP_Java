package com.JuaraCoding.OOP;

class Buku {
	String judul;
	String penulis;
	
	Buku (String judul, String penulis){
		this.judul=judul;
		this.penulis=penulis;
	}
	
	void display() {
		System.out.println("Judul :" + this.judul);
		System.out.println("Penulis :" + this.penulis);
	}
}

public class OOP5_ReferencePadaObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buku buku1 = new Buku (" Perkembangan Dunia IT ", " Lukman Nul Hakim ");
		buku1.display();
		
		// Menampilkan address
		String adressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
		System.out.println(adressBuku1);
		
		System.out.println();
		// Assigment object
		Buku buku2=buku1;
		buku2.display();
		String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
		System.out.println(addressBuku2);
		
		System.out.println();
		
		//karna buku2 dan buku1 berada pada address yang sama 
		buku2.judul = "Beranak dalam kubur";
		buku1.display();
		buku2.display();
		
		System.out.println();
		//kita akan memasukan object kedalam methods
		fungsi(buku2);
		buku1.display();
		buku2.display();
	}
		//ini methods fungsi
	public static void fungsi (Buku DataBuku) {
		String addressDataBuku = Integer.toHexString(System.identityHashCode(DataBuku));
		System.out.println("Address dalam fungsi" + addressDataBuku);
		DataBuku.penulis="Haruki Mahal kami";
	}
}
