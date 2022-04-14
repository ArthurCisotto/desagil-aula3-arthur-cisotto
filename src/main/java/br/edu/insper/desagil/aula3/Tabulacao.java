package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabulacao {

	public Map<String, Double> monta(List<Map<String, String>> alunos) {
		Map<String, Double> totais = new HashMap<>();

		// seu código aqui
		int numeroAlunos = alunos.size();
		for (Map<String, String> aluno: alunos) {
			String curso = aluno.get("curso");
			 if (!totais.containsKey(curso)) {
			    	totais.put(curso, 1.0);
			    }else {
			    	totais.put(curso, totais.get(curso)+1.0);
			    }
		}
		for (String curso: totais.keySet()){
		    double quantidadeAlunos = totais.get(curso);
		    totais.put(curso, (quantidadeAlunos/numeroAlunos)*100);
		}
		return totais;
	}

}
