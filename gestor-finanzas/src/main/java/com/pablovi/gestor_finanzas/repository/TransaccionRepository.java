package com.pablovi.gestor_finanzas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pablovi.gestor_finanzas.model.Transaccion;

public interface TransaccionRepository extends CrudRepository<Transaccion, Long> {

}
