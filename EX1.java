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
	static Scanner in = new Scanner(System.in);

	static void diviseurs(int n){
		System.out.println("Les diviseurs de "+ n +" sont :"):
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
			System.out.println(" " + i);
		}
	}

	static int nbrDiviseurs(int n){
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
			count++;
		}
		return count;
	}

	static int sommeDiviseurs(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args){
		int n;
		do {
			System.out.println("Entrez un entier positif : ");
			n = in.nextInt();
		}while(n < 0);

		diviseurs(n);
		System.out.println("Le nombre de ces diviseurs est :" + nbrDiviseurs(n));
		System.out.println("La somme de ces diviseurs est :" + sommeDiviseurs(n));
	}
}
