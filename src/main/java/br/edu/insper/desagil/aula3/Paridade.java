package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Paridade {

	public List<List<Integer>> separa(List<Integer> numeros) {
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		// seu código aqui
		for (Integer numero: numeros) {
			if (numero%2==0) {
				pares.add(numero);
			}
			else {
				impares.add(numero);
			}
		}

		List<List<Integer>> listas = new ArrayList<>();
		listas.add(pares);
		listas.add(impares);
		return listas;
	}

}
