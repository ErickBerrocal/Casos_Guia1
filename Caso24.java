package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingresa monto 1: ");
		float cant1 = sc.nextFloat();
		
		System.out.print("Ingresa monto 2: ");
		float cant2 = sc.nextFloat();
		
		System.out.print("Ingresa monto 3: ");
		float cant3 = sc.nextFloat();

		float op1 = (cant1/5)+(0.20f*cant2);
		float op2 = ((cant3*0.60f)+cant3)/2;
		float op3 = (cant1+cant2+cant3)-((cant1+cant2+cant3)*0.08f);
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El primer caso......: "+df.format(op1));
		System.out.println("El segundo caso.....: "+df.format(op2));
		System.out.println("El tercer caso......: "+df.format(op3));
		
		
		
		
		
		
	}

}
