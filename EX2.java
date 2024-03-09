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

		System.out.println("Entrez l'heure : ");
		int h = in.nextInt();
		System.out.println("Entrez les minutes : ");
		int min = in.nextInt();
		if ( min == 59 ){
			min = 00;
			h++;
		}
		else
			min++;
		System.out.println("L'heure apres une minute est : "+h+":"+min);
	}
}
