package mediumJavaClassObject;

public class Calculator {

	public static void main(String[] args) {
		// addint two number
		int sum1= add(40, 50);
		int sum2= add(100, 100);
		int sum3= add(25, 30);
		int sum4= add(1000,2000);
		int total= add(sum1 , sum2) + add(sum3 , sum4);
		System.out.println("total is " + total);
		// Multiplication method
		int mulResult= mult(20, 10);
		System.out.println("mult result is " + mulResult);
		// Subtraction method
		int subResult = sub(20, 30);
		System.out.println(subResult);
		


	}
	
	private static int sub(int i, int j) {
		// TODO Auto-generated method stub
		int subresult= i - j ;
		return subresult;
	}


	public static int add(int a, int b){
		
		int sum= a + b;
		System.out.println(sum);
		return sum;
		
	}
	
	
	public static int mult(int a, int b){
		int result = a * b;
		return result;
	}
	

}
