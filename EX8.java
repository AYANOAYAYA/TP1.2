/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author pro
 */

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		static Scanner in = new Scanner(System.in);
		int age;
		String sexe;

		System.out.println("Entrez votre age :");
		age = in.nextInt();

		System.out.println("Entrez votre sexe:");
		age = in.next();

		if((sexe.equalsIgnoreCase("Femme") && (age >= 18 && age <= 35)) || (sexe.equalsIgnoreCase("Homme") && age > 20))
			System.out.println("Imposable");
		else
			System.out.println("Non Imposable");
	}
}
