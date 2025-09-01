package jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import jokenpo.Jokenpo;

public class Jokenpo_Teste {
	
	//teste empate
		@Test
		public void empateTest() {
			Jokenpo jogo = new Jokenpo();
			int resultado = jogo.jogar(1, 1);
			assertEquals(0,resultado);
		}
		
		//teste vitória jogador 1
				@Test
				public void vitoria1Test() {
					Jokenpo jogo = new Jokenpo();
					int resultado = jogo.jogar(1, 2);
					assertEquals(1,resultado);
				}
				
		//teste vitória jogador 2
				@Test
				public void vitoria2Test() {
					Jokenpo jogo = new Jokenpo();
					int resultado = jogo.jogar(1, 3);
					assertEquals(2,resultado);
				}				
				
		//teste jogo inválido
				@Test
				public void invalidTest() {
					Jokenpo jogo = new Jokenpo();
					int resultado = jogo.jogar(1, 4);
					assertEquals(-1,resultado);
				}
	}
