package com.JuaraCoding.OOP;

class Data {
	public int intPublic;
	private int intPrivate;
	private double doublePrivate;
	
	
	public Data () {
		this.intPublic=0;
		this.intPrivate=20;
	}
	
	//Membuat fungsi atau method untuk getter
	public int getIntPrivate() {
		return this.intPrivate;
	}
	
	//Membuat fungsi atau method untuk setter
	public void setDoublePrivate(double value) {
		this.doublePrivate = value;
	}
	
	//Kita read semua entity lalu kita tampilkan
	void display () {
		
		System.out.println(this.intPublic);
		System.out.println(this.intPrivate);
		System.out.println(this.doublePrivate);
	}
}


class Lingkaran {
	private double diameter;
	
	Lingkaran(double diameter){
		this.diameter = diameter;
	}
	
	// Method setter
	public void setJari2 (double jari2) {
		this.diameter = jari2*2;
	}
	
	//Method getter
	public double getJari2 () {
		return this.diameter/2;
	}
	
	void display (	) {
		System.out.println(this.diameter);
	}
	//Method getter
	public double getLuas() {
		return 3.14*diameter*diameter/4;
	}
}

public class OOP7_Getter_Setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data1 = new Data ();
		data1.intPublic = 10;
		System.out.println(data1.intPublic);
		
		System.out.println();
		//Untuk read dari entity private kita panggil dengan getter caranya
		int angka = data1.getIntPrivate();
		System.out.println("ini adalah getter " + angka);
		
		System.out.println();
		//Untuk write entity private kita panggil dengan setter caranya
		data1.setDoublePrivate(50);
		data1.display();
		
		System.out.println();
		//Menggabungkan read dan write getter dan setter
		Lingkaran lingkaran = new Lingkaran (100);
		//double jari3 = lingkaran.getJari2();
		System.out.println("Ini adalah jari-jari " + lingkaran.getJari2() );
		lingkaran.setJari2(50);
		System.out.println(lingkaran.getJari2());
		//lingkaran.display();
		System.out.println("Ini adalah luas " + lingkaran.getLuas());
		
	}

}
