package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese lado 1: ");
		int lado1 = sc.nextInt();
		
		System.out.println("Ingrese lado 2: ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = lado1 * 2 + lado2 * 2;
		
		System.out.println("----- Resultados -----");
		System.out.println("Área del rectángulo.......: " + area);
		System.out.println("Perímetro del rectángulo..: " + perimetro);

	}

}
