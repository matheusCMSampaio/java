package br.com.fiap;

import java.util.Scanner;

public class CalculaIdadeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key;
		try {
			key = new Scanner(System.in);
			System.out.println("Digite o ano atual: ");
			int anoAtual = key.nextInt();
			System.out.println("Digite o ano de nascimento: ");
			int anoNascimento = key.nextInt();
			
			System.out.println("Sua idade e "+ (anoAtual - anoNascimento));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
