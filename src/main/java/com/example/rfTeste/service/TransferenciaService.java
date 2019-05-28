package com.example.rfTeste.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rfTeste.entity.DadosTransferenciaEntity;
import com.example.rfTeste.repository.TransferenciaRepository;

import exception.OperacaoException;

// TODO: Auto-generated Javadoc
/**
 * The Class TransferenciaService.
 */
@Service
public class TransferenciaService implements ITransacaoService{
	
	/** The repository. */
	@Autowired
	TransferenciaRepository repository;

	/* (non-Javadoc)
	 * @see com.example.rfTeste.service.ITransacaoService#transferencia(com.example.rfTeste.entity.DadosTransferenciaEntity)
	 */
	@Override
	public void transferencia(DadosTransferenciaEntity dadosTransferencia) throws OperacaoException{
		
		
		try {
			
			Double taxa = new Double(0);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dataTransferencia = LocalDate.parse(dadosTransferencia.getDataTransferencia(), formatter);
			LocalDate dataAgendamento = LocalDate.now();         
			
			dadosTransferencia.setDataAgendamento(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			dadosTransferencia.setDataTransferencia(dataTransferencia.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

			if (dataAgendamento.isEqual(dataTransferencia)) {
				taxa = (dadosTransferencia.getValor() * 0.03) + 3;
			}
					
			Period periodo = Period.between(dataAgendamento, dataTransferencia);
			
			if (periodo.getDays() <= 10) {
				taxa = new Double(12 * periodo.getDays());
			}
			
			if (periodo.getDays() > 10 && periodo.getDays() <=20) {
				taxa = (dadosTransferencia.getValor() * 0.08);
			} else if (periodo.getDays() > 20 && periodo.getDays() <=30) {
				taxa = (dadosTransferencia.getValor() * 0.06);
			} else if (periodo.getDays() > 30 && periodo.getDays() <=40) {
				taxa = (dadosTransferencia.getValor() * 0.04);
			} else if (periodo.getDays() > 40 && dadosTransferencia.getValor() > 100000) {
				taxa = (dadosTransferencia.getValor() * 0.02);
			} 
			
			if (taxa <= 0) {
				throw new OperacaoException("Não há taxa aplicável para a operação.");
			}
			
			dadosTransferencia.setTaxa(taxa);
			
			repository.save(dadosTransferencia);
						
			
		} catch (Exception e) {
			throw new OperacaoException(e.getMessage());
		}

	}
	
	/**
	 * Gets the agendamentos.
	 *
	 * @return the agendamentos
	 */
	public List<DadosTransferenciaEntity> getAgendamentos(){
		return repository.findAll();
		
	}

}
