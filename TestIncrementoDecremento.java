package br.senai.sp.jandira;

public class TestIncrementoDecremento {

	public static void main(String[] args) {
		
		//incremento
		int x = 10;
		System.out.println(x);
		
		x = x + 1;
		System.out.println(x);
		
		//decremento
		x = x - 1;
		System.out.println(x);
		
		System.out.println(x++);
		System.out.println(x);
		
		int a = x++;
		System.out.println(a);
		System.out.println(++a);
		
		int b = ++a;
		System.out.println(b);
		
		b += 7;
		System.out.println(b);
		
		b /= 4;
		System.out.println(b);
		
		
	}

}


















