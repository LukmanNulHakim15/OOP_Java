package com.JuaraCoding.HelloWorld;

import java.util.Scanner;



public class PakDewa  {
	public PakDewa() {
	System.out.println("Constructor Main Dijalankan");
	}
	public static void main (String [] args) {
		
	/*	Main testMain = new Main(); */
		
	//	HelloWorld hello = new HelloWorld();
		
	//	System.out.println(hello.getHello());
		
		//HelloWorld.HelloDunia("Dewa");
		//System.out.println(args[1]);
		
		// Integer.parseInt  (int)
	
		/*float angka = 1;
		System.out.println(angka);
		int pecahan = (int) angka;
        System.out.println(pecahan);	*/
		
	/*	int nilai = 1;
		String nilai2 = "2";
		String nilai3 = "3";
		String nilai4 ="3.0";
		double nilai5 = 5;
		*/
		//nilai 14
		
		//System.out.println((nilai + Integer.parseInt(nilai2)+Integer.parseInt(nilai3)+(int)Float.parseFloat(nilai4)+(int)nilai5));
		
		
		
	//	double x = 1+2*3*(10/2+5)/2;
	//	System.out.println(x);
		
	//	Scanner scan = new Scanner(System.in);
		
	//	System.out.println("Masukan sembarang angka");
	//	int nilai  = scan.nextInt();
		
		//>,<, =, <>, !, || ,&&
	/*	if(nilai %2 == 0) {
			System.out.println("Nilai yang diinput bilangan genap");
			
		} else {
			System.out.println("Nilai yang diinput bilangan ganjil");
		}
		
	*/
	/*	int counterBagi = 0 ;
		
		for (int x = 1; x <= nilai ; x++) {
			
			 if(nilai % x == 0 ) {
				 counterBagi++;
			 }	
			 
		}
		
		 if(counterBagi == 2) {
			 System.out.println("Bilangan Prima");
			 
		 }else {
			 System.out.println("Bukan Bilangan Prima");
		 }
		
		
		*/
		
	/*	Integer x = 5;
		int y = 5;
		
		//String object tapi diperlakukan primitif;
		String nama1 = "Dewa";
		String nama2 = new String ("Dewa");
		
		if (nama1.equalsIgnoreCase(nama2)) {
			
			System.out.println("Ini Sama");
		}else {
			System.out.println("Ini Beda");
		}
		
		System.out.println(nama1 + "==" + nama2);
*/		
     /*   Scanner scan = new Scanner(System.in);

		System.out.println("Berapakah anak anda ");
		int anak  = scan.nextInt();
		
		if(anak > 1) {
			System.out.println("Apakah anda sudah mengikuti program KB? (Y/T)");
			String jawab  = scan.next().toUpperCase();
			
			if (jawab.equalsIgnoreCase("Y")) {
				System.out.println("Silahkan Control ke puskesmas terdekat");
			}else {
				System.out.println("Silahkan mengikuti Program KB di puskesmas terdekat");
			}
			
		}else {
		
		   System.out.println("Anda belum perlu mengikuti KB");	
		}
	*/	
		 
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan nama binatang");
		String jawab  = scan.next().toLowerCase();
		
		switch (jawab) {
		case "kelinci":
		case "kucing":
			
		case "tikus" :
			System.out.println("Binatang Mamalia");
			break;
			
		case "katak":
			System.out.println("Binatang Reptile");
		case "kadal":
		case "Buaya":
		
			System.out.println("Binatang Reptile");
        break;
        
		case "burung" :
		case "bebek" :
			System.out.println("Binatang Aves/Unggas");
		break;
		
		case "pria" :
			System.out.println("Apakah anda sudah mengikuti program KB? (Y/T)");
			String lgbt  = scan.next().toUpperCase();
			
			if(lgbt.equalsIgnoreCase("Y")) {
				System.out.println("Hayo ketahuan");
				
			}else {
				System.out.println("Normal");
				
			}
		break;	
			
		default:
			System.out.println();
			
		}
	*/
		
	/*	
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan panjang bintang yang diinginkan");
		int panjang = scan.nextInt();
		System.out.println("Masukan lebar bintang yang diinginkan");
		int lebar = scan.nextInt();

		int nilai = 0;

		for (int x = 0; x < lebar; x++) {

			for (int y = 0; y < panjang; y++) {

				nilai = nilai + 1;

				int counterBagi = 0;

				for (int z = 1; z <= nilai; z++) {

					if (nilai % z == 0) {
						counterBagi++;
					}

				}

				if (counterBagi == 2) {
					System.out.print("!");

				} else {
					System.out.print("*");
				}
			}

			System.out.println("");

		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int panjang = scan.nextInt();
		
		for (int x = 0; x < panjang ;x ++) {
			
				for(int y = 0 ; y <= x; y++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			
		}
		
		
		
	/*	for (int x =0 ; x < panjang ;x ++) {
			
				for(int y = 0 ; y <= panjang; y++) {
					
					if (y<=x) {
						System.out.print("*");
					}else {
						System.out.print("!");
					}
					
					
				}
				
				System.out.println();
			
		}*/
	
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int panjang = scan.nextInt();
		
		for (int x = 0; x < panjang; x++) {

			int dummyKiri = panjang - x;
			int dummyKanan = panjang + x;

			for (int y = 0; y <= panjang * 2; y++) {

				if (y == panjang) {
				
					System.out.print("!");
				} else {

					if (y < dummyKiri) {
						
						System.out.print(" ");

					} else {
						if (y > panjang && y > dummyKanan) {
							
							System.out.print(" ");
							
						} else {
							
							System.out.print("*");
						}
					}
				}
			}
			System.out.println("");

		}*/
		
		
		
	} 

}
