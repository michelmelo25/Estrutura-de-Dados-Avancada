package br.ufc.quixada.eda.testes;

import java.io.IOException;
import java.util.List;

import br.ufc.quixada.eda.listaprioridades.LPMaximaNOrdenada;
import br.ufc.quixada.eda.util.CriarInstancia;
import br.ufc.quixada.eda.util.EDAConstants;
import br.ufc.quixada.eda.util.EDAUtil;
import br.ufc.quixada.eda.util.Operacao;

public class TesteListaPrioridadesNOrdenado {
	public static void main(String args[]){		
		try {
			for (int tamanho : CriarInstancia.tamanhoInstanciasLP) {				
				String path = EDAConstants.listaPrioridade + "tarefa" + tamanho + ".txt";
				List<Integer> entrada = EDAUtil.getDadosIniciais(path);
				
				//PARA ARQUIVO COM MAIOR QUANTIDADE DE INSER��ES
				String arquivoOperacao = "operacoesI_" + tamanho;
				path = EDAConstants.listaPrioridade + arquivoOperacao + ".txt";
				List<Operacao> operacoes = EDAUtil.getOperacoes(path);
				long tempoInicial = System.currentTimeMillis();				
				LPMaximaNOrdenada listaPrioridade = new LPMaximaNOrdenada(2*entrada.size());
				listaPrioridade.contruir(entrada);							
				
				//fazer o long app_a, opp_r, opp_i, opp_s e toppInicial para caucular cada uma das operações 
				
				for (Operacao operacao : operacoes) {
					//System.out.println(operacao.getId() + " " + operacao.getValor() + " " + operacao.getNovoValor());
					if(operacao.getId().equals("A")){
						listaPrioridade.alterarPrioridade(operacao.getValor(), operacao.getNovoValor());
					}else if(operacao.getId().equals("R")){
						listaPrioridade.remove();
					}else if(operacao.getId().equals("I")){
						listaPrioridade.inserir(operacao.getValor());
					}else{
						listaPrioridade.getMaximaPrioridade();
					}
				}	
				long tempo = System.currentTimeMillis() - tempoInicial;			  
				System.out.println(arquivoOperacao + ": " + tempo);
				
				//PARA ARQUIVO COM MAIOR QUANTIDADE DE ALTERA��ES
				arquivoOperacao = "operacoesA_" + tamanho;
				path = EDAConstants.listaPrioridade + arquivoOperacao + ".txt";
				operacoes = EDAUtil.getOperacoes(path);
				
				tempoInicial = System.currentTimeMillis();				
				listaPrioridade = new LPMaximaNOrdenada(2*entrada.size());
				listaPrioridade.contruir(entrada);							
			
				for (Operacao operacao : operacoes) {
					//System.out.println(operacao.getId() + " " + operacao.getValor() + " " + operacao.getNovoValor());
					if(operacao.getId().equals("A")){
						listaPrioridade.alterarPrioridade(operacao.getValor(), operacao.getNovoValor());
					}else if(operacao.getId().equals("R")){
						listaPrioridade.remove();
					}else if(operacao.getId().equals("I")){
						listaPrioridade.inserir(operacao.getValor());
					}else{
						listaPrioridade.getMaximaPrioridade();
					}
				}	
				tempo = System.currentTimeMillis() - tempoInicial;			  
				System.out.println(arquivoOperacao + ": " + tempo);		
				
				//ASSIM POR DIANTE, PARA REMO��O E SELE��O
				
				//Para arquivo com maior quantidade de remocao
				arquivoOperacao = "operacoesR_" + tamanho;
				path = EDAConstants.listaPrioridade + arquivoOperacao + ".txt";
				operacoes = EDAUtil.getOperacoes(path);
				
				tempoInicial = System.currentTimeMillis();				
				listaPrioridade = new LPMaximaNOrdenada(2*entrada.size());
				listaPrioridade.contruir(entrada);							
			
				for (Operacao operacao : operacoes) {
					//System.out.println(operacao.getId() + " " + operacao.getValor() + " " + operacao.getNovoValor());
					if(operacao.getId().equals("A")){
						listaPrioridade.alterarPrioridade(operacao.getValor(), operacao.getNovoValor());
					}else if(operacao.getId().equals("R")){
						listaPrioridade.remove();
					}else if(operacao.getId().equals("I")){
						listaPrioridade.inserir(operacao.getValor());
					}else{
						listaPrioridade.getMaximaPrioridade();
					}
				}	
				tempo = System.currentTimeMillis() - tempoInicial;			  
				System.out.println(arquivoOperacao + ": " + tempo);		
				
				
				//Para arquivo com maior qauntidade de seleçao
				arquivoOperacao = "operacoesS_" + tamanho;
				path = EDAConstants.listaPrioridade + arquivoOperacao + ".txt";
				operacoes = EDAUtil.getOperacoes(path);
				
				tempoInicial = System.currentTimeMillis();				
				listaPrioridade = new LPMaximaNOrdenada(2*entrada.size());
				listaPrioridade.contruir(entrada);							
			
				for (Operacao operacao : operacoes) {
					//System.out.println(operacao.getId() + " " + operacao.getValor() + " " + operacao.getNovoValor());
					if(operacao.getId().equals("A")){
						listaPrioridade.alterarPrioridade(operacao.getValor(), operacao.getNovoValor());
					}else if(operacao.getId().equals("R")){
						listaPrioridade.remove();
					}else if(operacao.getId().equals("I")){
						listaPrioridade.inserir(operacao.getValor());
					}else{
						listaPrioridade.getMaximaPrioridade();
					}
				}	
				tempo = System.currentTimeMillis() - tempoInicial;			  
				System.out.println(arquivoOperacao + ": " + tempo);		
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}