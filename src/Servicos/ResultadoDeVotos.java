package Servicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import entidade.Candidatos;
import excexoes.ExcecoesPersonalizadas;

public class ResultadoDeVotos implements ServicoDeVotacao{
	
	Map<String, Integer> votos = new HashMap<>();
	
	public void resultadoFinalDaVotaçao(String caminhoDoArquivo) throws ExcecoesPersonalizadas {
		
	File caminho = new File(caminhoDoArquivo);

		if (caminho.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {
				String itens = br.readLine();
				while (itens != null) {

					String[] pastas = itens.split(",");
					String nome = pastas[0];
					Integer quantidadeDeVotos = Integer.parseInt(pastas[1]);

					Candidatos candidatos = new Candidatos(nome, quantidadeDeVotos);
					
					if (votos.containsKey(candidatos.getNome()) == false) {
						throw new ExcecoesPersonalizadas("Verifique seu arquivo!");
					} else if (votos.containsKey(candidatos.getNome())) {
						int somaDosVotos = votos.get(candidatos.getNome());
						votos.put(candidatos.getNome(), somaDosVotos + quantidadeDeVotos);
					} else {
						votos.put(candidatos.getNome(), quantidadeDeVotos);
					}
					itens = br.readLine();
				}
			} catch (IOException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
	
	public void printaVotos() {
		
		String[] msg = new String[votos.size()];
		int contador = 0;
	
		for (String key : votos.keySet()) {
			msg[contador] = "" + key + ": " + votos.get(key);
			System.out.println(msg[contador]);
			contador += 1;
		}	
	}

}
	
