package com.JuaraCoding.OOP;
// Beajar Constructor

// Class tanpa constructor



// Class dengan constructor
class Siswa {
	String nama;
	double kelas;
	int umur;
	
//	Siswa(){
//		System.out.println("ini adalah constructor");
//		// Constructor adalah suatu fungsi atau method yang pertama kali di panggil saat objek dibuat
//	}
	
	//constructor dengan parameter
	Siswa(String inputNama, double inputKelas, int inputUmur){
	
		nama = inputNama;
		kelas = inputKelas;
		umur = inputUmur;
		
		
	}
}

public class OOP2_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siswa siswa1 = new Siswa ("Ucup",2.1,13);
		Siswa siswa2 = new Siswa ("Otong", 2.2, 14);
		System.out.println(siswa1.nama);
		System.out.println(siswa1.kelas);
		System.out.println(siswa1.umur);
		System.out.println("");// bisa jadi fungsi enter
		System.out.println(siswa2.nama);
		System.out.println(siswa2.kelas);
		System.out.println(siswa2.umur);
		
		
//		System.out.println(siswa1.nama);
//		System.out.println(siswa1.kelas);
//		System.out.println(siswa1.umur);
	
		
		
//		Mahasiswa2 mahasiswa1 = new Mahasiswa2();
//		mahasiswa1.nama = "Lukman";
//		mahasiswa1.umur = 28;
//		
//		System.out.println(mahasiswa1.nama);
//		System.out.println(mahasiswa1.umur);

	}

}
