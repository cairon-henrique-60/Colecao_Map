package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Servicos.ResultadoDeVotos;
import excexoes.ExcecoesPersonalizadas;

public class Programa {

	public static void main(String[] args) throws ExcecoesPersonalizadas {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite o caminho do arquivo: ");
			String caminhoDoArquivo = sc.nextLine();
			
			ResultadoDeVotos resultadoDeVotos = new ResultadoDeVotos();
			
			resultadoDeVotos.resultadoFinalDaVotaçao(caminhoDoArquivo);
			
			resultadoDeVotos.printaVotos();
		} catch (InputMismatchException e) {
			System.out.println("Erro inesperado!");
		} finally {
			sc.close();
		}

	}

}
