package com.JuaraCoding.HelloWorld;

import java.util.Scanner;

public class jajal1 {
	
	public static void main(String[]args) {
	
	
/*	int nilai=1;
	String nilai2 = "2";
	String nilai3 = "3";
	String nilai4 = "3.0";
	double nilai5 = 5;
	
	System.out.println ((nilai +Integer.parseInt(nilai2)+Integer.parseInt(nilai3)+(int)Float.parseFloat(nilai4)+(int)nilai5));
	*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Masukkan angka sekarang?");
		int nilai = scan.nextInt();
		
		if (nilai %2==0){
			
			System.out.println ("Nilai yang di input adalah bilangan genap");
			
		}else {
			System.out.println ("Nilai yang di input adalah bilangan ganjil");
		}
	}
		
}


