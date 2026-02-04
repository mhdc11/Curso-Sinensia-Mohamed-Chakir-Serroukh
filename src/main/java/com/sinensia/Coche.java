package com.sinensia;

public class Coche extends Vehiculos{

    private String modelo;
    private int potencia;
    private int añoDeMatriculacion;
    private String color;
    private String dueño;
    private static int numeroDeRuedas;  




    public Coche(String modelo, int potencia, int añoDeMatriculacion, String color, String dueño, int numeroDeRuedas){
        
        super(modelo, potencia, añoDeMatriculacion, color, dueño);
        this.numeroDeRuedas = numeroDeRuedas;
        this.numeroDeRuedas = numeroDeRuedas;

    }

    public void arrancarCoche(){
    super.arrancar();

    super.apagar();
    }

}   

    