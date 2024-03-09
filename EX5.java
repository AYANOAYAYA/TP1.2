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

		int joueurs [] = new int [22];
		int i, num_buteur = 0, total = 0, count = 0;

		System.out.println("Entrez le nombre de buts par chacun des joueurs de l’équipe :");
		for(i = 0; i < 22; i++){
			System.out.println("Joueur numero " + (i + 1) + " :");
			joueurs [i] = in.nextInt();
		}

		int buteur = joueurs [0];
		for(i = 1; i < 22; i++){
			if(joueurs [i] > buteur){
				buteur = joueurs [i];
				num_buteur = i;
			}
		}
		System.out.println("Le numéro du buteur de l’équipe est : " + (num_buteur+1));

		for(i = 1; i < 22; i++){
			total += joueurs [i];

			if(joueurs [i] == 0)
				count++;
		}
		System.out.println("Le nombre total des buts inscrits par cette équipe est : "+ total);
		System.out.println("le nombre des joueurs qui n’ont pas marqué de buts est : "+ count);

		joueurs[8] += 2;

		System.out.println("Nouveau nombre de buts pour le joueur numero 9 est : " + joueurs[8]);


	}
}
