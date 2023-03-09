package br.com.fiap;

import javax.swing.JOptionPane;

public class AreaCirculoJOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = Math.PI;
		try {
			double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
			double area = PI * Math.pow(raio, 2);
			JOptionPane.showMessageDialog(null, "A area do seu circulo e: "+ area);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
