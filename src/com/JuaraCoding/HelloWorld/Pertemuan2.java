package com.JuaraCoding.HelloWorld;

import java.util.Scanner;

public class Pertemuan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Membuat Bilangan Prima
		// Rules bilangan prima adalah imana angka tersebut hanya bisa di bagi 2 kali yaitu dirinya sendiri dengan angka 1
	/*	Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan Angka Yang Ingin Anda Cek");
		int angka = scan.nextInt();
		
		int counterBagi=0;
		for (int x = angka; x > 1; x--) {
			if (angka % x ==0) {
				counterBagi++;
			}
		}
		
		if (counterBagi == 2) {
			System.out.println ("Bilangan Prima");
		} else {
			System.out.println ("Bukan Bilangan Prima");
		} */ 
		
		
		// Membuat Pengencekan Keuarga Berencana
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.println ("Berapakah anak anda?");
		int anak = scan.nextInt();
		
		if (anak > 1) {
			System.out.println ("Apakah anda sudah mengikuti program KB? (Y / T)");
			String jawab = scan.next().toUpperCase();
			
			if (jawab.equalsIgnoreCase("Y")) {
				System.out.println ("Silahkan kontrol ke puskesmas terdekat");
				
			}else {
				System.out.println ("Silahkan mengikuti program KB di puskesmas terdekat");
			}
		
			
		}else {
			System.out.println ("Anda belum perlu memasang KB");
		} */
		
		
		// Membuat Program Switch
		
	/*	Scanner scan =  new Scanner(System.in);
		System.out.println ("Masukan nama binatang");
		String nama = scan.next().toLowerCase();
		
		switch (nama) {
		case "kelinci":
		case "kucing":
		case "lumba-lumba":
			System.out.println ("Ini binatang mamalia");
		break;
		
		case "ular":
		case "biyawak":
		case "cicak":
			System.out.println ("Ini binatang reptile");
		break;
		default:
			System.out.println ("Binatang apa itu yak?");
			break;
		} */
		
		// Membuat Bintang *****
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan bintang jumlah yang anda inginkan");
		int bintang = scan.nextInt();
		
		for (int x = 0; x < bintang; x++ ) {
			System.out.print("*");
		} */
		
		// Tugas membuat dua dimensi bintang 
		//panjangnya 2      *****
		// dan lebarnya 5   *****
		
		/*Scanner scan = new Scanner (System.in);
		System.out.println ("Masukkan jumlah panjang bintang");
		int panjang = scan.nextInt();
		System.out.println ("Masukan jumlah lebar bintang");
		int lebar = scan.nextInt();
		
		
		for (int x = 0; x < panjang; x++) {
			for (int y = 0; y < lebar; y++) {
				System.out.print("*");
			}
			
			System.out.println ("");
		} */
		
		
		// Membuat ***** Menjadi *!!*! yang tanda seru bilangan prima
		//	 	   *****		 *!***
	
	
 Scanner scan = new Scanner (System.in);
	System.out.println("Masukan panjang bintang");
	int panjang = scan.nextInt();
	System.out.println ("Masukan lebar bintang");
	int lebar = scan.nextInt();
	
	int angka = 0;
	
	for (int i = 0; i < panjang; i++) {
		for (int y = 0; y < lebar; y++) {
			

			
			int counterBagi = 0;
			
			angka++;
			
			for (int z = 1; z <= angka; z++) {
				if (angka % z == 0) {
					counterBagi++;
				}
			}
			
			if (counterBagi == 2) {
				
				System.out.print ("!");
			
			} else {
				
				System.out.print ("*");
				}
			
			}
		
		System.out.println ("");
	
		}  
		
		// Membuat piramid bintang *
		//						   **
		//						   ***
		//						   ****
		//						   *****
		
	//	Scanner scan = new Scanner (System.in);
	//	System.out.println ("Masukan panjang bintang");
	//	int panjang = scan.nextInt();
		//System.out.println ("Masukan lebar bintang");
		//int lebar = scan.nextInt();
		
		/*for (int i = 1; i <= panjang ; i++) {
			for (int y = 0; y < i; y++) {
				System.out.print("*");
			}
			
			System.out.println ("");
		} */
		
		
		// Membuat *!!!!
		//		   **!!!
		//		   ***!!
		//		   ****!
				  
	/*	Scanner scan = new Scanner (System.in);
		System.out.print("Masukan panjang bintang");
		int panjang = scan.nextInt();
		
		for (int i = 1; i < panjang; i ++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for ( int y = 5; y > i; y--) {
				System.out.print("!");
			}
			
			System.out.println ("");
		} */ 
		
		
	
	}


}
