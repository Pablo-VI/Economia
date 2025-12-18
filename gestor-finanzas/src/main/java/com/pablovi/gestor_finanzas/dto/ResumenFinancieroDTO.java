package com.pablovi.gestor_finanzas.dto;

import java.math.BigDecimal;

public class ResumenFinancieroDTO {
    private BigDecimal totalIngresos;
    private BigDecimal totalGastosFijos;
    private BigDecimal totalGastosVariables;
    private BigDecimal saldoTotal;

    public ResumenFinancieroDTO(BigDecimal totalIngresos, BigDecimal totalGastosFijos, BigDecimal totalGastosVariables,
            BigDecimal saldoTotal) {
        this.totalIngresos = totalIngresos;
        this.totalGastosFijos = totalGastosFijos;
        this.totalGastosVariables = totalGastosVariables;
        this.saldoTotal = saldoTotal;
    }

    public ResumenFinancieroDTO() {
    }

    public BigDecimal getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(BigDecimal totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public BigDecimal getTotalGastosFijos() {
        return totalGastosFijos;
    }

    public void setTotalGastosFijos(BigDecimal totalGastosFijos) {
        this.totalGastosFijos = totalGastosFijos;
    }

    public BigDecimal getTotalGastosVariables() {
        return totalGastosVariables;
    }

    public void setTotalGastosVariables(BigDecimal totalGastosVariables) {
        this.totalGastosVariables = totalGastosVariables;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
