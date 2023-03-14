package br.com.fiap;

import java.util.Scanner;

public class MediaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double array[] = new double[4];
		Scanner key;
		double media = 0;
		try {
			key = new Scanner(System.in);
			for(int i = 0; i < array.length; i++) {
				System.out.println("Digite o " +(i+1)+" numero");
				array[i] = key.nextInt();
				media += array[i];
			}
			System.out.println("Media dos quatro numeros e "+(media/4));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
