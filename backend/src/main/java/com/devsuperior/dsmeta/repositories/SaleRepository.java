package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
 /* Repository é um componente do sistema que acessa o banco de dados,
  * fazendo buscas insersoes, delecoes, alteracoes. */
}
