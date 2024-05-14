package com.dio.padroesprojetos.repository;

import com.dio.padroesprojetos.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
