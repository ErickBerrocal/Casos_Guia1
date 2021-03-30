package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, perimetro;
		
		System.out.println("Ingrese Radio: ");
		int lado = sc.nextInt();
		
		perimetro = 2 * 3.1416 * lado;
		area = 3.1416 * Math.pow(lado, 2);
		
		System.out.println("----- Resultados -----");
		System.out.println("Área del círculo.......: " + area);
		System.out.println("Perímetro del círculo..: " + perimetro);

	}

}
