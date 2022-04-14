package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> d) {
		Map<String, List<String>> nomes = new HashMap<>();

		// seu código aqui
		for (String nome: d.keySet()) {
			List<String> sobrenomes = d.get(nome);
			for (String sobrenome: sobrenomes) {
				if (!nomes.containsKey(sobrenome)) {
					nomes.put(sobrenome, new ArrayList<>());
				}
				nomes.get(sobrenome).add(nome);
			}
		}
		return nomes;
	}

}
