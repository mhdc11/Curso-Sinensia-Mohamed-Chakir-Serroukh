package com.sinensia;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeSelecciónDeMenu;
        Duenio chakir = new Duenio("48081738P", "Mohamed Chakir Serroukh");
        Concesionario concesionario = new Concesionario("MC Car's and Motors");
        Coche seatIbiza     = null;
        Coche toyotaCorolla = null;
        Coche bmwSerie3     = null;
        Coche audiA3        = null;
                    
        do{
            System.out.println("Selecciona un número del Menú: ");
            System.out.println("1-) Mostrar la lista de los coches disponibles");
            System.out.println("2-) Mostrar la lista de las motos disponibles");
            System.out.println("3-) Mostrar coches en propiedad");
            System.out.println("4-) Mostrar motos en propiedad");
            System.out.println("5-) Añadir Coches");
            System.out.println("6-) Añadir Moto");
            System.out.println("7-) Probar coche");
            System.out.println("8-) Probar moto");
            System.out.println("0-) Salir");
            numeroDeSelecciónDeMenu = sc.nextInt();

            switch (numeroDeSelecciónDeMenu) {
                case 1 :
                    concesionario.mostrarListaDeCochesDisponibles();
                    break;
                case 2 :
                    concesionario.mostrarListaDeMotosDisponibles();                    
                    break;
                case 3 :
                    chakir.mostrarCochesEnPropiedad();
                    break;
                case 4 :
                    System.out.println("numero 4");
                    break;
                case 5 :
                    //Aquí es la de añadir coches
                    try {
                        chakir.aniadirCoche(audiA3);
                    
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("numero 5");
                    break;
                case 6 :
                    System.out.println("numero 6");
                    break;
                case 7 :
                    System.out.println("numero 7");
                    break;
                case 0 :   
                    System.out.println("Adiós"); 
                    break;
            }

        }while(numeroDeSelecciónDeMenu != 0);
        



        //concesionario.crearCoches();
        //Coche renaultMegane = new Coche("Megane", 110, 2026, "Negro", "Chakir", 4, "0001ABC");
        

        //concesionario.crearMotos();
        //Moto hondaPcx125   = new Moto("PCX 125", 12, 2024, "Blanco", "Mohamed", 2, "M-1001-ABC");
        


    }
}
