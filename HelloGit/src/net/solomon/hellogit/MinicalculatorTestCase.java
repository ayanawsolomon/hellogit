package net.solomon.hellogit;

public class MinicalculatorTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int additonResutl =cal.add(5,5);
		if(additonResutl == 10){
			System.out.println("additon pass");
		}else{
			System.out.println("Addtion fai");
		}
		
		int mulResutl = cal.mul(5,5);
		if(mulResutl == 25){
			System.out.println("mul pass");
		}else{
			System.out.println("mul fai");
		}

	}

}
