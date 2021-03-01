package br.com.agente.padrao;

import java.util.stream.IntStream;

public class Teste {
	 public static void main(String[] args) {
		    IntStream.iterate(2, x -> x < 20, x -> x * 2).forEach(System.out::print);
		  }
		  
}
