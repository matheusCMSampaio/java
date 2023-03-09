package br.com.fiap;

import java.util.Scanner;

public class AreaCirculoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key;
		try {
			final double PI = Math.PI;
			
			key = new Scanner(System.in);
			System.out.println("Digite o valor do raio: ");
			double raio = key.nextDouble();
			
			double area = PI * Math.pow(raio, 2);
			System.out.println("A area do seu circulo e: "+ area);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
