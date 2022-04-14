package br.edu.insper.desagil.aula3;

import java.util.List;

public class Variancia {

	public double calcula(List<Integer> numeros) {
		double media = 0.0;
		int n = numeros.size();
		for (Integer numero: numeros) {
			media += numero;
		}
		media /= n;
		
		double variancia = 0.0;
		for (Integer numero: numeros) {
			variancia += Math.pow(numero-media, 2);
		}
		variancia /= n;		
		return variancia;
	}

}
