package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Ingresa el lado 1: ");
		float lado1 = sc.nextFloat();
		
		System.out.println("Ingresa el lado 2: ");
		float lado2 = sc.nextFloat();
		
		System.out.println("Ingresa el lado 3: ");
		float lado3 = sc.nextFloat();
		
		float perimetro = lado1 + lado2 + lado3;
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El perímetro es: "+perimetro+" u");
		System.out.println("--------------------------");

	}

}