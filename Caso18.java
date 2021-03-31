package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Programa que permite obtener el parea de un triangiulo.
		
		System.out.print("Ingresa la longitud de la base: ");
		float base = sc.nextFloat();
		
		System.out.print("Ingresa la altura: ");
		float altura = sc.nextFloat();
		
		
		float area = base * altura / 2;
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El área es: "+area+" u²");
		System.out.println("--------------------------");
	}

}