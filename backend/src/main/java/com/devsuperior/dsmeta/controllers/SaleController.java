package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	/* variacao do padrao de tres camadas: controller, service, repository;
	 *  controller chama service, service chama o repository */ 
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
	}
	/* método que disponibiliza a lista de vendas para o frontend. 
	 * O GetMapping serve para o metodo responder via web por meio do protocolo http */

}
