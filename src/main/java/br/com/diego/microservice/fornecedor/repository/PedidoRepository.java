package br.com.diego.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.diego.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
