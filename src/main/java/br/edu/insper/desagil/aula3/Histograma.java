package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Histograma {

	public List<Integer> calcula(List<Integer> numeros) {
		List<Integer> l = new ArrayList<>();
		for (int indice = 0; indice < 10; indice++) {
			int quantidade = 0;
			for (Integer numero: numeros) {
				if (numero == indice) {
					quantidade ++;
				}
			}
			l.add(quantidade);
		}
		return l;
	}

}
