package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		float n1 = sc.nextInt();
		
		System.out.print("Ingrese nota 2: "); 
		float n2 = sc.nextInt();
		
		System.out.print("Ingrese nota 3: "); 
		float n3 = sc.nextInt();
		
		float promedio = n1*0.20f + n2*0.30f + n3*0.50f;
		
		System.out.println("***********************");
		System.out.println("      RESULTADOS       ");
		System.out.println("***********************");
		
		System.out.println("Nombre del alumno.....: " + alumno);
		System.out.println("Promedio de las notas.: " + df.format(promedio));
		
	}

}