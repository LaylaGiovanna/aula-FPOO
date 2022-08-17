package br.senai.sp.jandira;

public class TestOrAnd {

	public static void main(String[] args) {
		//test with OR ||
		
		boolean testOr;
		testOr = 1 > 3 || 3 > 1;
		System.out.printf("1 > 3 || 3 > 1 -> %s \n" , testOr);
		
		testOr = 1 > 3 || 3 > 1 || 1 < 3;
		System.out.printf("1 > 3 || 3 > 1 || 1 < 3 -> %s \n" , testOr);
		
		//test with AND &&
		testOr = 1 > 3 && 3 > 1;
		System.out.printf("1 > 3 && 3 > 1 -> %s \n" , testOr);
		
		testOr = 1 > 3 && 3 > 1 && 1 < 3;
		System.out.printf("1 > 3 && 3 > 1 && 1 < 3 -> %s\n" , testOr);
		
		testOr = 1 < 3 && 3 > 1 && 1 < 3;
		System.out.printf(" 1 < 3 && 3 > 1 && 1 < 3 -> %s\n" , testOr);

	}

}
