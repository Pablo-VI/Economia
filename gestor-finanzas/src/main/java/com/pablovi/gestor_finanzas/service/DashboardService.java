
package com.pablovi.gestor_finanzas.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.pablovi.gestor_finanzas.dto.ResumenFinancieroDTO;
import com.pablovi.gestor_finanzas.model.Categoria;
import com.pablovi.gestor_finanzas.model.Transaccion;
import com.pablovi.gestor_finanzas.repository.CategoriaRepository;
import com.pablovi.gestor_finanzas.repository.TransaccionRepository;

@Service
public class DashboardService {

    private final TransaccionRepository transaccionRepository;
    private final CategoriaRepository categoriaRepository;

    public DashboardService(TransaccionRepository transaccionRepository, CategoriaRepository categoriaRepository) {
        this.transaccionRepository = transaccionRepository;
        this.categoriaRepository = categoriaRepository;
    }

    public ResumenFinancieroDTO obtenerResumen() {
        BigDecimal ingresos = BigDecimal.ZERO;
        BigDecimal gastosFijos = BigDecimal.ZERO;
        BigDecimal gastosVariables = BigDecimal.ZERO;
        BigDecimal saldo = BigDecimal.ZERO;

        Iterable<Transaccion> transacciones = transaccionRepository.findAll();
        
        Iterable<Categoria> categorias = categoriaRepository.findAll();

        return null; 
    }

}

