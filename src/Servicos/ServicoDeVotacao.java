package Servicos;

import excexoes.ExcecoesPersonalizadas;

public interface ServicoDeVotacao {
	default void resultadoFinalDaVotaçao(String caminhoDoArquivo) throws ExcecoesPersonalizadas {
		
	}
}
