package br.edu.operacoes;

public class Divisao extends OperacaoMatematica{
	public double calcular(double a, double b) throws DivisaoPorZeroException {
		if(b == 0) {
			throw new DivisaoPorZeroException();		
			}
		return a / b;
	}
}
