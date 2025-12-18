package com.pablovi.gestor_finanzas.model;

import org.springframework.data.annotation.Id;

public class Categoria {

    @Id
    private long id;
    private String nombre;
    private TipoGasto tipoGasto;
    private Boolean esFijo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoGasto getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(TipoGasto tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public Boolean getEsFijo() {
        return esFijo;
    }

    public void setEsFijo(Boolean esFijo) {
        this.esFijo = esFijo;
    }
}
