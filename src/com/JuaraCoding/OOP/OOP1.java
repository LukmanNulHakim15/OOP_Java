package com.JuaraCoding.OOP;


class Mahasiswa {
	// Mempunyai data sebagai berikut
	// Contoh class atau variable interlocal
	
	String nama;
	int usia;
	int NIM;
	String jurusan;
	double IPK;
	
	
}

public class OOP1 {

	
	//Membuat Instan (Inisiasi)
	// Membuat object (bisa 1 atau lebih) dari class mahasiswa
	
//	class Mahasiswa {
//		// Mempunyai data sebagai berikut
		// Ini adalah contoh class atau variable local
		// Syarat instance adalah class atau variable harus interlocal
//		
//		String nama;
//		int usia;
//		int NIM;
//		String jurusan;
//		double IPK;
//		
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Membuat object dari suatu class itu yang dinamakan instance
		
		Mahasiswa mahasiswa1 = new Mahasiswa ();
		mahasiswa1.nama = "Lukman Nul Hakim";
		mahasiswa1.usia = 18;
		mahasiswa1.NIM = 1161;
		mahasiswa1.jurusan = "Teknik Informatika";
		mahasiswa1.IPK = 3.16;
		
		System.out.println(mahasiswa1.nama);
		System.out.println(mahasiswa1.usia);
		System.out.println(mahasiswa1.NIM);
		System.out.println(mahasiswa1.jurusan);
		System.out.println(mahasiswa1.IPK);
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa2.nama = "Siti Munawaroch";
		mahasiswa2.usia = 19;
		mahasiswa2.NIM = 1201;
		mahasiswa2.jurusan = "Teknik Informatika";
		mahasiswa2.IPK = 3.35;
		
		System.out.println("");
		System.out.println(mahasiswa2.nama);
		System.out.println(mahasiswa2.usia);
		System.out.println(mahasiswa2.NIM);
		System.out.println(mahasiswa2.jurusan);
		System.out.println(mahasiswa2.IPK);
		
		
	}

}
