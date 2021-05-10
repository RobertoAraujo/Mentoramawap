package br.gov.ac.sefaz.classes;

public class GerenciadorDeVendas {

	private int numero1;
	private int numero2;
	
	public double soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
	public double multiplica(double numero1, double numero2) {
		double resultado =  numero1 * numero2 ;
		return resultado;
	}
	
	public double subtrai(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		return resultado;
	}
	
	public double divide(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}
	
}
