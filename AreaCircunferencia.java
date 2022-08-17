package br.senai.sp.jandira;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		double area, raio;
		final double PI = 3.14;
		
		raio = 8.0;
		
		area = 2 * PI * raio;
		
		System.out.println("A área da circunferência é: " + area + "cm2");
		System.out.printf("A área da circunferência é: %scm2" , area);
		
		 
		

	}

}