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
		int poids, taille;
		double IMC;
		String sexe, etat;

		System.out.println("Entrez le poids en kg : ");
		poids = in.nextInt();

		System.out.println("Entrez la taille en m : ");
		taille = in.nextInt();

		System.out.println("Entrez le sexe : ");
		sexe = in.next();

		IMC = poids / (Math.pow(taille, 2));
		System.out.println("IMC = " + IMC);

		if((sexe.equalsIgnoreCase("Femme") && IMC < 19) || (sexe.equalsIgnoreCase("Homme") && IMC < 20)){
			etat = "Maigreur";
		} else if((sexe.equalsIgnoreCase("Femme") && (IMC >= 19 && IMC < 24)) || (sexe.equalsIgnoreCase("Homme") && (IMC >= 20 && IMC < 25))){
			etat = "Poids normal";
		} else if((sexe.equalsIgnoreCase("Femme") && (IMC >= 24 && IMC < 30)) || (sexe.equalsIgnoreCase("Homme") && (IMC >= 25 && IMC < 30))){
			etat = "Surcharge pondérale";
		} else if((sexe.equalsIgnoreCase("Femme") && (IMC >= 30 && IMC < 40)) || (sexe.equalsIgnoreCase("Homme") && (IMC >= 30 && IMC < 40))){
			etat = "Adiposité";
		} else if((sexe.equalsIgnoreCase("Femme") && IMC >= 40) || (sexe.equalsIgnoreCase("Homme") && IMC >= 40)){
			etat = "Obésité";
		}

		System.out.println("L'état de poids est " + etat);

	}
}
