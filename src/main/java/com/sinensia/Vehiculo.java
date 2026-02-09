package com.sinensia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public abstract class Vehiculo implements Comparable <Vehiculo>{
    private String modelo;
    private int potencia;
    private int anioDeMatriculacion;
    private String color;
    private String duenio;    
    private String matricula;
    private Integer precio;
    
    protected Vehiculo (String modelo, Integer precio ,int potencia, int anioDeMatriculacion, String color, String duenio, String matricula) {
        this.modelo = modelo;
        this.precio = precio;
        this.potencia = potencia;
        this.anioDeMatriculacion = anioDeMatriculacion;
        this.color = color;
        this.duenio = duenio;
        this.matricula = matricula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnioDeMatriculacion() {
        return anioDeMatriculacion;
    }

    public void setAnioDeMatriculacion(int anioDeMatriculacion) {
        this.anioDeMatriculacion = anioDeMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public abstract void arrancar();

    public abstract void apagar();


    @Override
        public int hashCode() {
        return Objects.hash(matricula);
    }
    

   

    


    





}
