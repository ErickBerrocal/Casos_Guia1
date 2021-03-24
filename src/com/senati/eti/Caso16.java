package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas....: ");
		int hor = sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora.....: ");
		float tar = sc.nextFloat();
		
		float sueldo = hor * tar;
		
		float bono = (sueldo * 5) / 100;
		
		float total = sueldo + bono; 
		
		float dolar = (float) (total / 3.24);
		
		System.out.println("\n-----------------------------");
		System.out.println("---- R E S U L T A D O S ----");
		System.out.println("-----------------------------");
		System.out.println("Sueldo.............: " + df.format(sueldo));
		System.out.println("Bono...............: " + df.format(bono));
		System.out.println("Total..............: " + df.format(total));
		System.out.println("Total en dólares...: " + df.format(dolar));

	}

}
