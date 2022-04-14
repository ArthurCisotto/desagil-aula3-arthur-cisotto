package br.edu.insper.desagil.aula3;

import java.util.List;
import java.util.Map;

public class Media {

	public double calcula(List<Map<String, Integer>> notas) {
		double somaPesos = 0.0;
		double somaValoresMultiplicados = 0.0;
		for (Map<String, Integer> dicionario: notas) {
			double peso = (double) dicionario.get("peso");
			double valor = (double) dicionario.get("valor");
			somaPesos += peso;
			somaValoresMultiplicados += (peso*valor);
		}
		return (somaValoresMultiplicados/somaPesos);
	}

}
