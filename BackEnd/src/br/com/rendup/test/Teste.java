package br.com.rendup.test;

import br.com.rendup.model.Usuario;

public class Teste {
	public static void main(String[] args) {
		Usuario novo = new Usuario();
		
		novo.generateToken();
	}
}
