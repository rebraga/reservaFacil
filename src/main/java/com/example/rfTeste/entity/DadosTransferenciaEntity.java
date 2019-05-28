package com.example.rfTeste.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class DadosTransferenciaEntity.
 */
@Entity
public class DadosTransferenciaEntity {

	
	/** The id. */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	/** The conta origem. */
	@Column(name="contaOrigem", nullable=false)
	private String contaOrigem;
	
	/** The conta destino. */
	@Column(name="contaDestino", nullable=false)
	private String contaDestino;
	
	/** The valor. */
	@Column(name="valor", nullable=false)
	private Double valor;
	
	/** The taxa. */
	@Column(name="taxa", nullable=false)
	private Double taxa;
	
	/** The data transferencia. */
	@Column(name="dataTransferencia", nullable=false)
	private String dataTransferencia;
	
	/** The data agendamento. */
	@Column(name="dataAgendamento", nullable=false)
	private String dataAgendamento;
	
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
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
	public Double getValor() {
		return valor;
	}
	
	/**
	 * Sets the valor.
	 *
	 * @param valor the new valor
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	/**
	 * Gets the taxa.
	 *
	 * @return the taxa
	 */
	public Double getTaxa() {
		return taxa;
	}
	
	/**
	 * Sets the taxa.
	 *
	 * @param taxa the new taxa
	 */
	public void setTaxa(Double taxa) {
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
