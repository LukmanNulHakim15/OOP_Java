package com.JuaraCoding.HelloWorld;

import java.util.Scanner;

public class MenggambardenganJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Menggambar dengan kotak
		
		/*Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan jumlah bintang yang diinginkan");
		int bintang = scan.nextInt();
		
		for (int i = 0; i < bintang; i++) {
			for (int j = 0; j < bintang; j++) {
				System.out.print("*");
			}
			
			System.out.println ("");
		} */
		
		// Menggambar Segitiga
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan jumlah bintang yang diinginkan");
		int panjang = scan.nextInt();
		
		for (int i = 1; i < panjang; i ++) {
			for ( int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println ("");
		} 
		
		
		// Menggambar Segiti Terbalik
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan jumlah panjang bintang ");
		int panjang = scan.nextInt();
	
		
		for (int i = 1; i < panjang; i++) {
			for (int j = panjang; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println ();
		} */ 
		
		
		// Gambar Selang Seling
/*		Scanner scan = new Scanner (System.in);
		System.out.println ("Masukan jumlah panjang bintang ");
		int panjang = scan.nextInt();
	
	int angka = 0;
		
		for (int i = 1; i < panjang; i++) {
			for (int j = panjang; j > i; j--) {
				
				int counterBagi = 0;
				
				angka++;
				
				for (int z = 1; z <= angka; z++) {
					if (angka % 2 == 0) {
						counterBagi++;
					}
				}
				
				if (counterBagi == 0) {
					
					System.out.print ("!");
				
				} else {
					
					System.out.print ("*");
					}
				
				}
			
			System.out.println ("");
		
			} */   
				
		// Gambar campur
		
		/*Scanner scan = new Scanner (System.in);
		System.out.print("Masukan panjang bintang");
		int panjang = scan.nextInt();
		
		for (int i = 1; i < panjang; i ++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for ( int y = 5; y > i; y--) {
				System.out.print("#");
			}
			
			System.out.println ("");
		} */
		
	//	Gabung Gambar
		
	/*	Scanner scan = new Scanner (System.in);
		System.out.print("Masukan panjang bintang");
		int panjang = scan.nextInt();
		
		int angka = 0;
		
		for (int i = 1; i < panjang; i ++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for ( int y = 5; y > i; y--) {
				System.out.print("#");
			}
			
			System.out.println ("");
		}  

		for (int i = 1; i < panjang; i++) {
			for (int j = panjang; j > i; j--) {
				
				int counterBagi = 0;
				
				angka++;
				
				for (int z = 1; z <= angka; z++) {
					if (angka % 2 == 0) {
						counterBagi++;
					}
				}
				
				if (counterBagi == 0) {
					
					System.out.print ("!");
				
				} else {
					
					System.out.print ("*");
					}
				
				}
			
			System.out.println ("");
		
			} */

	}

}
