package com.pablovi.gestor_finanzas.service;

import org.springframework.stereotype.Service;

import com.pablovi.gestor_finanzas.repository.TransaccionRepository;

@Service
public class DashboardService {

    private final TransaccionRepository transaccionRepository;

    public DashboardService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

}
