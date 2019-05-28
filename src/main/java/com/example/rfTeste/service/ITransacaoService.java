package com.example.rfTeste.service;

import com.example.rfTeste.entity.DadosTransferenciaEntity;

import exception.OperacaoException;

public interface ITransacaoService {
	
	public void transferencia(DadosTransferenciaEntity dadosTransferencia) throws OperacaoException;

}
