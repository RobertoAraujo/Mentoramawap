package br.gov.ac.sefaz.app;

import br.gov.ac.sefaz.classes.Cliente;
import br.gov.ac.sefaz.classes.GerenciadorDeVendas;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setIdade(32);
		cliente.setNome("Roberto Araujo");
		
		System.out.println(" idade " + cliente.getIdade());
		System.out.println(" Nome "+ cliente.getNome());
		
		GerenciadorDeVendas calcu = new GerenciadorDeVendas();
		
		System.out.println("Soma = "+calcu.soma(22, 22));
		
		System.out.println("Subtrai = "+calcu.subtrai(22, 22));
		// aqui methodo multiplicar
		System.out.println("Multiplicar = "+calcu.multiplica(22, 22));
		// methodo divide 
		System.out.println("divide = "+calcu.divide(22, 22));

	}

}
