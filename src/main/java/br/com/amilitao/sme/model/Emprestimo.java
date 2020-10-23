package br.com.amilitao.sme.model;

import java.time.LocalDate;

public class Emprestimo implements Movimentacao {

	private Empresa origem;
	private Empresa destino;
	private Equipamento equipamento;
	private LocalDate dt_inicio;
	private LocalDate dt_fim;

	public Emprestimo(Empresa origem, Empresa destino, Equipamento equipamento) {
		this.origem = origem;
		this.destino = destino;
		this.equipamento = equipamento;
		this.dt_inicio = LocalDate.now();
	}

	public Empresa getOrigem() {
		return origem;
	}

	public void setOrigem(Empresa origem) {
		this.origem = origem;
	}

	public Empresa getDestino() {
		return destino;
	}

	public void setDestino(Empresa destino) {
		this.destino = destino;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public LocalDate getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(LocalDate dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public LocalDate getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(LocalDate dt_fim) {
		this.dt_fim = dt_fim;
	}

}
