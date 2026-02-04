package com.sinensia;

public abstract class Vehiculos {
    private String modelo;
    private int potencia;
    private int añoDeMatriculacion;
    private String color;
    private String dueño;    

    
    public Vehiculos (String modelo, int potencia, int añoDeMatriculacion, String color, String dueño) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.añoDeMatriculacion = añoDeMatriculacion;
        this.color = color;
        this.dueño = dueño;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAñoDeMatriculacion() {
        return añoDeMatriculacion;
    }

    public void setAñoDeMatriculacion(int añoDeMatriculacion) {
        this.añoDeMatriculacion = añoDeMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void arrancar(){
        System.out.println("ARRANCO COCHE");
    }

    public void apagar(){
        System.out.println("APAGO COCHE");
    }




}
