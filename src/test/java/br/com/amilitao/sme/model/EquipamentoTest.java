package br.com.amilitao.sme.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EquipamentoTest {

	@Test
	public void deveCriarDoisEquipamentosDiferentes() {
		
		Equipamento equipamento1 = new Equipamento();
		Equipamento equipamento2 = new Equipamento();
		
		equipamento1.setId(1);
		equipamento1.setNome("Impressora Zebra");
		
		equipamento2.setId(2);
		equipamento2.setNome("Scanner de mão");
		
		assertEquals("Impressora Zebra", equipamento1.getNome());
		assertEquals("Scanner de mão", equipamento2.getNome());
		
	}

}
