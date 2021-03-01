package br.com.agente.padrao;

public class Agente extends Thread{
	
	Desejo desejo;
	String caminhoClasse;
	
    public void run(){
    	/**um desejo fica sendo reinstanciado de tempos em tempos para ver se pode ser intenção.*/
    	desejo = new Desejo();
    	boolean aplicaDesejo = desejo.analisador(caminhoClasse);
    	
    	if(aplicaDesejo) {
    		Intencao intencao = new Intencao();
    		intencao.modificador();
    	}
    }	
    
}
