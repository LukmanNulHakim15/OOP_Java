package com.JuaraCoding.OOP;

class looping {
	int x;
	int y;
	
	looping (){
		for (int x = 0; x < 5; x ++) {
			for (int y = 0; y < 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
public class OOP2_Latihan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new looping();
	}

}
