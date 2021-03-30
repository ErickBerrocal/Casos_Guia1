package com.senati.eti;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese el monto del gasto: ");
		float gasto = sc.nextFloat();
		
		float reduccion = gasto - ( gasto * 0.12f );
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El gasto actual es: "+gasto+" $");
		System.out.println("El nuevo gasto es: "+reduccion+" $");
		System.out.println("--------------------------");

	}

}
