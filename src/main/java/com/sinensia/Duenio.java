package com.sinensia;

import java.util.ArrayList;

public class Duenio {

    private String dni;              
    private String nombreCompleto;

    public ArrayList <Coche> cochesEnPropiedad = new ArrayList<>();

    private int numCoches;    

    public Duenio(String dni, String nombreCompleto) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;

    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void aniadirCoche(Coche coche){
        
            if(coche == null){
                System.out.println("El coche que me has pasado no existe");
            }else{
                if (this.cochesEnPropiedad.isEmpty()) {
                    this.cochesEnPropiedad.add(coche);

                } else {
                    for (int i = 0; i < this.cochesEnPropiedad.size(); i++) {
                    System.out.println("He entrado al for en la vuelta "+ i);
                    if(coche.equals(this.cochesEnPropiedad.get(i))){
                        System.out.println("Este coche ya existe");
                    }else{
                        System.out.println("Coches añadido");
                        this.cochesEnPropiedad.add(coche);

                    }
                }
                
                }

            }

        
    }

    public void mostrarCochesEnPropiedad(){
        
        if(this.cochesEnPropiedad.isEmpty()){
            System.out.println("No tiene ningún coche");
            
        }else{
            System.out.println("Estos son los coches que tiene: ");
            for (int i = 0; i < this.cochesEnPropiedad.size(); i++) {
                System.out.println(cochesEnPropiedad.get(i).getModelo());
            }
        }
        

    }




}