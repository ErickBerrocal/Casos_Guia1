package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		float rpta1 = (float)((n1 * 20) / 100);
		float dsct1 = n1 + rpta1;
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		float rpta2 = (float)((n2 * 30) / 100);
		float dsct2 = n2 - rpta2;
		float prom = ((n1 + n2) / 2);
		
		System.out.println("------------------");
		System.out.println("Resultados");
		System.out.println("------------------");
		System.out.println("Resultado 1:" + prom);
		System.out.println("Resultado 2:" + dsct1);
		System.out.println("Resultado 3:" + dsct2);
	}

}
