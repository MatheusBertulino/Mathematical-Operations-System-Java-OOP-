package br.edu.operacoes;

public class Principal {
	public static void main(String[] args) {
		
		OperacaoMatematica soma = new Soma();
		OperacaoMatematica divisao = new Divisao();
		
		try {
			System.out.println("soma: " + soma.calcular(10,5));
		    System.out.println("divisao: " + divisao.calcular(10, 2));
	        System.out.println("Divisao por zero: " + divisao.calcular(10, 0));
		} catch (DivisaoPorZeroException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro geral: " + e.getMessage());
		}
	}

}
