package com.JuaraCoding.HelloWorld;

public class BangunBidang {

/*	private String namaBidang = "";
	private double resultKalkulasi = 0.0;
	
	
	
	
	public double getResultKalkulasi() {
		return resultKalkulasi;
	}

	public void setResultKalkulasi(double resultKalkulasi) {
		this.resultKalkulasi = resultKalkulasi;
	}

	public static double PI = 3.14;
	
	
	public BangunBidang (String bidang) {
		
		this.namaBidang = bidang;
	
	}
	
	public double luasLingkaran (double r) {
		
		double luasLingkaran = PI * r * r ; 
		
		return  luasLingkaran;
	}
	
	public void hasil () {
		
		System.out.println ("Luas bangun bidang "+this.namaBidang+ " adalah ..." + this.getResultKalkulasi());
	} */
	
	/*private String namaBidang = "";
	private double resultKalkulasi = 0.0;
	
	
	
	
	public double getResultKalkulasi() {
		return resultKalkulasi;
	}

	public void setResultKalkulasi(double resultKalkulasi) {
		this.resultKalkulasi = resultKalkulasi;
	}

	//public static double PI = 3.14;
	//public static double P = 0.0;
	//public static double T = 0.0;
	
	public BangunBidang (String bidang) {
		
		this.namaBidang = bidang;
	
	}
	
	public double luasKotak (double s  ) {
		
		double luasKotak = s * s ; 
		
		return  luasKotak;
		
		//double luasLingkaran = PI * r * r ; 
		
		//return  luasLingkaran;
	}
	
	public void kotak () {
		
	//	System.out.println ("Luas bangun bidang "+this.namaBidang+ " adalah ..." + this.getResultKalkulasi());
	
		for (int i = 20; i < this.getResultKalkulasi(); i++) {
			for (int j = 20; j < this.getResultKalkulasi(); j++) {
				System.out.print("*");
			}
			
			System.out.println ("");
		} 
				
	}
	
	public void segitiga () {
		
		for (int i = 20; i < this.getResultKalkulasi(); i ++) {
			for ( int j = 19; j < i; j++) {
				System.out.print("*");
			}
			System.out.println ("");
		}
	}

	
	public void segitigaTerbalik () {
		
		for (int i = 20; i < this.getResultKalkulasi(); i++) {
			for (double j = this.getResultKalkulasi(); j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println ();
		}
	}
	
	
	public void selangSeling () {
		
		int angka = 0;
		
		for (int i = 20; i < this.getResultKalkulasi(); i++) {
			for (double j = this.getResultKalkulasi(); j > i; j--) {
				
				int counterBagi = 0;
				
				angka++;
				
				for (int z = 1; z <= angka; z++) {
					if (angka % 2 == 0) {
						counterBagi++;
					}
				}
				
				if (counterBagi == 0) {
					
					System.out.print ("*");
				
				} else {
					
					System.out.print ("!");
					}
				
				}
			
			System.out.println ("");
		
			}
	}
	
	public void campur () {
	for (int i = 20; i < getResultKalkulasi(); i ++) {
		for (int j = 19; j < i; j++) {
			System.out.print("*");
		}
		
		for ( int y = 25; y > i; y--) {
			System.out.print("#");
		}
		
		System.out.println ("");
	}
	
	}
	
	public void gabungGambar() {
	
	int angka = 0;
	
	for (int i = 20; i < getResultKalkulasi(); i ++) {
		for (int j = 19; j < i; j++) {
			System.out.print("*");
		}
		
		for ( int y = 25; y > i; y--) {
			System.out.print("#");
		}
		
		System.out.println ("");
		
	}

	for (int i = 20; i < this.getResultKalkulasi(); i++) {
		for (double j = this.getResultKalkulasi(); j > i; j--) {
			
			int counterBagi = 0;
			
			angka++;
			
			for (int z = 1; z <= angka; z++) {
				if (angka % 2 == 0) {
					counterBagi++;
				}
			}
			
			if (counterBagi == 0) {
				
				System.out.print ("*");
			
			} else {
				
				System.out.print ("!");
				}
			
			}
		
		System.out.println ("");
	
		}

	} */
	
	// Source code ujian pekan pertama yang benar
	 
	/*	private int baris;
		private int kolom;
		
		public BangunBidang (int baris, int kolom) {
			this.baris = baris;
			this.kolom = kolom;
		} */ // Bisa menggunakan ini namun untuk memasukan baris dan kolom di konstrakternya
		
		public void gambarKotak (int baris, int kolom) {
			for (int i = 0; i < baris; i++) {
				for (int j = 0; j < kolom; j++) {
					System.out.print("*");
				}
				
				System.out.println("");
			}
	}

	
		public void gambarSelangSeling (int baris) {
			for (int i = 0; i < baris; i++) {
				for (int j = baris; j > i; j--) {
					if ((i % 2 == 0 && j % 2==1) || (i % 2 == 1 && j % 2 == 0)) {
						System.out.print("!");
					}else {
						System.out.print("*");
					}
						
				}
								
				System.out.println("");
			}
		}
		
		public void gambarCampur (int baris, int kolom) {
			for (int i = 1; i < baris; i ++) {
				for (int j = kolom; j > i; j--) {
					System.out.print("*");
				}
				for (int y = 0; y < i; y++) {
					System.out.print("#");
				}
				
			System.out.println ("");
			
			}
		}
}


