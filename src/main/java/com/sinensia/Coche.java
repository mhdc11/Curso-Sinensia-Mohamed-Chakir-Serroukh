package com.sinensia;

import java.util.Objects;

public class Coche extends Vehiculo{


    private final int numeroDeRuedas;  




    public Coche(String modelo, Integer precio,int potencia, int anioDeMatriculacion, String color, String duenio, int numeroDeRuedas, String matricula){
        
        super(modelo, precio, potencia, anioDeMatriculacion, color, duenio, matricula);
        this.numeroDeRuedas = 4;

    }

    @Override
    public void arrancar() {
        
        System.out.println("Coche arrancado");
    }

    @Override
    public void apagar(){
        System.out.println("Coche apagado");
    }

    public void bajarVentanilla(){
        System.out.println("Bajando las ventillas del coche: "+ this.getModelo() +" de color: " + this.getColor() + "con potencia de: " + this.getPotencia() + " y de matricula " + this.getMatricula());
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Coche other = (Coche) obj;

        return getMatricula() != null && getMatricula().equals(other.getMatricula());
    }
    
    @Override
    public int compareTo(Coche other) {
        return this.getPrecio().compareTo(other.getPrecio());
        
    }


}   

    