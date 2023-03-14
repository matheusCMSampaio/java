package br.com.fiap;

import javax.swing.JOptionPane;

public class CalculaIdadeJOption {
	public static void main(String[] args) {

		try {
			int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
			int anoNascido = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que nasceu"));
			System.out.println("Sua idade é " + (anoAtual - anoNascido));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
