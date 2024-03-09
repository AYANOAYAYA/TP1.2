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

	static int checkAmis(int num){
		int sum = 0;
		for(int i = 2; i < num; i++){
			if(num % i == 0)
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args){
		int n, m, sum1, sum2;

		do {
			System.out.println("Entrez le premier entier positif : ");
			n = in.nextInt();
		}while(n <= 1);

		do {
			System.out.println("Entrez le deuxieme entier positif : ");
			m = in.nextInt();
		}while(m <= 1);

		sum1 = checkAmis(n);
		sum2 = checkAmis(m);

		if (sum1 == m && sum2 == n)
			System.out.println(n + " et "+ m + " sont amis.");
		else
			System.out.println(n + " et "+ m + " ne sont pas amis.");
	}
}
