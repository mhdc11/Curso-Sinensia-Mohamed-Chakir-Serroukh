package com.sinensia;

public class Coche extends Vehiculos{


    private final int numeroDeRuedas;  




    public Coche(String modelo, int potencia, int anioDeMatriculacion, String color, String dueño, int numeroDeRuedas, String matricula){
        
        super(modelo, potencia, anioDeMatriculacion, color, dueño, matricula);
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

}   

    