package com.example.rfTeste.vo;

import java.io.Serializable;

/**
 * The Class TransferenciaVo.
 */
public class DadosTransferenciaVo implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5679917363920793400L;
	
	private Long id;
	
	/** The conta origem. */
	private String contaOrigem;
	
	/** The conta destino. */
	private String contaDestino;
	
	/** The valor. */
	private String valor;
	
	/** The taxa. */
	private String taxa;
	
	/** The data transferencia. */
	private String dataTransferencia;
	
	/** The data agendamento. */
	private String dataAgendamento;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the conta origem.
	 *
	 * @return the conta origem
	 */
	public String getContaOrigem() {
		return contaOrigem;
	}
	
	/**
	 * Sets the conta origem.
	 *
	 * @param contaOrigem the new conta origem
	 */
	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	
	/**
	 * Gets the conta destino.
	 *
	 * @return the conta destino
	 */
	public String getContaDestino() {
		return contaDestino;
	}
	
	/**
	 * Sets the conta destino.
	 *
	 * @param contaDestino the new conta destino
	 */
	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}
	
	/**
	 * Gets the valor.
	 *
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	
	/**
	 * Sets the valor.
	 *
	 * @param valor the new valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	/**
	 * Gets the taxa.
	 *
	 * @return the taxa
	 */
	public String getTaxa() {
		return taxa;
	}
	
	/**
	 * Sets the taxa.
	 *
	 * @param taxa the new taxa
	 */
	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}
	
	/**
	 * Gets the data transferencia.
	 *
	 * @return the data transferencia
	 */
	public String getDataTransferencia() {
		return dataTransferencia;
	}
	
	/**
	 * Sets the data transferencia.
	 *
	 * @param dataTransferencia the new data transferencia
	 */
	public void setDataTransferencia(String dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}
	
	/**
	 * Gets the data agendamento.
	 *
	 * @return the data agendamento
	 */
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	
	/**
	 * Sets the data agendamento.
	 *
	 * @param dataAgendamento the new data agendamento
	 */
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	

}
