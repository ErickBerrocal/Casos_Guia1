package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese el monto de la venta: ");
		float venta = sc.nextFloat();
		
		float incremento = ( venta * 0.42f ) + venta;
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El nuevo monto es: "+incremento+" $");
		System.out.println("--------------------------");

	}

}