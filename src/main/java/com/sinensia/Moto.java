package com.sinensia;

public class Moto extends Vehiculos{


    private final int numeroDeRuedas;

        public Moto (String modelo, int potencia, int anioDeMatriculacion, String color, String duenio, int numeroDeRuedas, String matricula){
        
        super(modelo, potencia, anioDeMatriculacion, color, duenio, matricula);
        this.numeroDeRuedas = 4;

    }

    @Override
    public void arrancar() {
       System.out.println("Arranco la moto");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apago la moto");
        
    }

    public void hacerCaballito(Moto moto){
    System.out.println("Estoy yendo a una rueda con la moto: " + moto.getModelo() + "cuya matricula es: " + moto.getMatricula() +" su potencia es " + moto.getPotencia() + " y su color es" + moto.getColor());
    }

    
}
