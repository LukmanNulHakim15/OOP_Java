package com.JuaraCoding.HelloWorld;

import java.util.Scanner;

public class main {
	
	/* public main() {
		System.out.println("Construktor Main Dijalankan");
	} */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	main testmain = new main();
		
		HelloWorld hello = new HelloWorld();
		hello.sayHello();
		
		HelloWorld.HelloDunia("Lukman");
		System.out.println(args); */
		
		
		/* BangunBidang belajar = new BangunBidang ("Lingkaran");
		belajar.setResultKalkulasi(belajar.luasLingkaran(7));
		belajar.hasil(); */
		
		//BangunBidang belajar = new BangunBidang ("Kotak");
		//belajar.setResultKalkulasi(belajar.luasKotak(5));
		//belajar.kotak();
		//belajar.segitiga();
		//belajar.segitigaTerbalik();
		//belajar.selangSeling();
		//belajar.campur();
		//belajar.gabungGambar();
		Scanner scn = new Scanner(System.in);
		String ulang = "Y";
		while (ulang.equalsIgnoreCase("Y")) {
		
			BangunBidang bidang = new BangunBidang ();
			System.out.println ("1. Gambar Kotak");
			System.out.println ("2. Gambar Selang Seling");	
			System.out.println ("3. Gambar Campur");
			System.out.println ("4. Exit");
			System.out.println ("Masukan pilihan anda = ");
			int pilihan = scn.nextInt();
			
			switch (pilihan) {
			case 1: {
				
				bidang.gambarKotak (5,5);
				break;		
			}
			
			case 2: {
			
				bidang.gambarSelangSeling(5);
				break;
			}
			
			case 3: {
				
				bidang.gambarCampur(5, 5);
				break;
			}
			
			case 4: {
				ulang = "T";
				System.out.println("Anda sudah keluar");
			}
			default:
				System.out.print("Pilihan tidak ada");
			}
			
		}
		
		
				
		
	}

}
