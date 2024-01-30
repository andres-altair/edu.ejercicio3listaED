package Controladores;

import java.util.ArrayList;
import java.util.Scanner;

import Dtos.meses;

public class inicioç 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		ArrayList<meses> mes = new ArrayList<meses>();
	
		for(int i = 1 ;i <5;i++){
		System.out.println("escribe el nombre del mes");
		String nomes = sc.next();
		System.out.println("escribe el numero del mes");
		int nmes = sc.nextInt();
		mes.add(new meses(nomes,nmes));}
		
		boolean opcion = true;
		while(opcion)
		{System.out.println("escribe el numero del mes");
		System.out.println(mes.get(sc.nextInt()).toString());
		
		System.out.println("quires seguir/si/no)?");
		 opcion = sc.nextBoolean();}	
	}

}

