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

	static int checkParfait(int n){
		int sum = 0;
		for(int i = 1; i < n; i++){
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
		}while(n <= 1);

		if (checkParfait(n) == n)
			System.out.println(n + " est un nombre parfait.");
		else
			System.out.println(n + " n'est pas un nombre parfait.");
	}
}
