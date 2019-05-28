package com.example.rfTeste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.rfTeste.entity.DadosTransferenciaEntity;
import com.example.rfTeste.service.TransferenciaService;

import exception.OperacaoException;


/**
 * The Class TransferenciaController.
 */
@Controller
@RequestMapping("/")
public class TransferenciaController {
	
	/** The transferencia service. */
	@Autowired
	TransferenciaService transferenciaService;
	
	/**
	 * Lista agendamentos.
	 *
	 * @param autor the autor
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/agendamentos", method = RequestMethod.GET)
    public String listaAgendamentos(Model model) {
          List<DadosTransferenciaEntity> agendamentos = transferenciaService.getAgendamentos();
          if (agendamentos != null) {
                model.addAttribute("agendamentos", agendamentos);
          }
          return "agendamentos";
    }


    /**
     * Realiza transferencia.
     *
     * @param dadosTransferencia the dados transferencia
     * @param model the model
     * @return the string
     */
    @RequestMapping(value = "/transferir", method = RequestMethod.POST)
    public String realizaTransferencia(DadosTransferenciaEntity dadosTransferencia, Model model) {
    	
        try {
        	  
			transferenciaService.transferencia(dadosTransferencia);
			
		} catch (OperacaoException e) {
			model.addAttribute("error", "Operação: "+ e.getMessage());
			return "agendamentos"; 
		}
         
        return "redirect:/agendamentos";
    }
}
