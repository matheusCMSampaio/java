package br.com.fiap;

import javax.swing.JOptionPane;

public class MediaJOption {
	public static void main(String[] args) {
		double array[] = new double[4];
		double media = 0;
		try {
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o "+(i+1)+" numero: "));
				media += array[i];
			}
			JOptionPane.showMessageDialog(null, "Media dos quatro numeros e "+(media/4));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
