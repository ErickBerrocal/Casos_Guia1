package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.00");
		
		System.out.print("Ingresa el prodcuto: ");
		String produc = sc.nextLine();
		
		System.out.print("Ingresa el precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingresa la cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = precio*cantidad;
		float igv = importe * 0.18f;
		float desc = importe * 0.03f;
		float importeT = (importe + igv) - desc;
		
		System.out.println("\n--------------------------");
		System.out.println("---------RESULTADO--------");
		System.out.println("El importe es........: "+df.format(importe));
		System.out.println("El igv es ...........: "+df.format(igv));
		System.out.println("El descuento es......: "+df.format(desc));
		System.out.println("El importe total es..: "+df.format(importeT));
		System.out.println("--------------------------");
		
		
		
		
		
		
		
		
		

	}

}