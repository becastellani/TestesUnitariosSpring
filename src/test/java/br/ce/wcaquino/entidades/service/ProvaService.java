package br.ce.wcaquino.entidades.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


import br.ce.wcaquino.entidades.Prova;


public class ProvaService {
	
	public float CalcularMedia(Prova p1, Prova p2, Prova p3) {
		float media = (p1.getNota() + p2.getNota() + p3.getNota()) / 3;
		
		return media;
	}
	
	
	public void teste_media() {
		//Cenário
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(10);
		Prova prova2 = prova1;
		Prova prova3 = new Prova(8);
		
		
		//Ação
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//Validação
		assertFalse(status != "Aprovado");
		assertTrue(status == "Aprovado");
		assertNotNull(status);
		assertEquals(status, "Aprovado");
		assertSame(prova1, prova2);
		assertNotSame(prova1, prova3);
		assertTrue(prova1.equals(prova2));
	}
	
	@Test
	public void teste_media_oportunidade() {
		//Cenário
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(4);
		Prova prova2 = prova1;
		Prova prova3 = new Prova(4);
		
		
		//Ação
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		System.out.println(media);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//Validação
		assertFalse(status != "2 oportunidade");
		assertTrue(status == "2 oportunidade");
		assertNotNull(status);
		assertEquals(status, "2 oportunidade");
		assertSame(prova1, prova2);
		assertNotSame(prova1, prova3);
		assertTrue(prova1.equals(prova2));
		
	}
	
	public void teste_media_reprovado() {
		//Cenário
		ProvaService provaService = new ProvaService();
		Prova prova1 = new Prova(2);
		Prova prova2 = prova1;
		Prova prova3 = new Prova(2);
		
		
		//Ação
		String status = "";
		float media = provaService.CalcularMedia(prova1, prova2, prova3);
		if(media >= 7) {
			status = "Aprovado";
		}else if(media >= 4 && media < 7) {
			status = "2 oportunidade";
		}else if(media < 4) {
			status = "Reprovado";
		}
		
		//Validação
		
		assertFalse(status != "Reprovado");
		assertTrue(status == "Reprovado");
		assertNotNull(status);
		assertEquals(status, "Reprovado");
		assertSame(prova1, prova2);
		assertNotSame(prova1, prova3);
		assertTrue(prova1.equals(prova2));
	}
}





