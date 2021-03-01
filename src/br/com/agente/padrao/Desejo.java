package br.com.agente.padrao;

public class Desejo {

	Crenca crenca = new Crenca();
	
	public boolean analisador(String caminhoClasse) {
		boolean resultado = false;
		if(crenca.ehClasse()) {
			resultado = true;
		}
		return resultado;
	}
	
}
