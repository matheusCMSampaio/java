package br.com.fiap;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int x = key.nextInt();
		System.out.println(x);
		
		for (int i = 0; i <=10; i++) {
			System.out.println(x + "x"+ i+ " = "+x*i );
		}
	}

}
