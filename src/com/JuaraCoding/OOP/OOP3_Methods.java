package com.JuaraCoding.OOP;

class Mahasiswa3 {
	//Data member
	String nama;
	String NIM;
	
	//Constructor sebenernya method khusus yang akan dipanggil pada saat objek dibuat
	Mahasiswa3 (String nama, String NIM){
		this.nama = nama;
		this.NIM = NIM;
		//Penjelasannya this.nama ngambil dari class Mahasiswa3
		// Sedangkan nama dari parameter constructor 
		
	
	}
	
		//method tanpa return dan tanpa parameter
		 void show() {
				 System.out.println("Nama :" + this.nama);
				 System.out.println("Nim :" + this.NIM);
			}
		 //Method tanpa return dan dengan parameter
		 void setNama(String nama) {
			 this.nama= nama;
		 }
		 //Method dengan return tapi tidak ada parameter
		 String getNama() {
			 return this.nama;
		 }
		 String getNIM() {
			 return this.NIM;
		 }
		 //Method dengan return 
	
}

public class OOP3_Methods {

	
	public static void main (String[] args) {
		
		Mahasiswa3 Mahasiswa1 =  new Mahasiswa3 ("Lukman","0809");
		// Method yang pertama
		Mahasiswa1.show();
		System.out.println("");
		Mahasiswa1.setNama("Badu");
		Mahasiswa1.show();
		System.out.println();
		System.out.println(Mahasiswa1.getNama());
		System.out.println(Mahasiswa1.getNIM());
	}
	
}
