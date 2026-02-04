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

        do{
            System.out.println("Selecciona un número del Menú: ");
            System.out.println("1-) Crear Coches");
            System.out.println("2-) Crear Motos");
            System.out.println("3-) Ver Coches");
            System.out.println("4-) Ver Motos");
            System.out.println("5-) Añadir Coches");
            System.out.println("6-) Añadir Moto");
            System.out.println("7-) Probar coche");
            System.out.println("8-) Probar moto");
            System.out.println("0-) Salir");
            numeroDeSelecciónDeMenu = sc.nextInt();

            switch (numeroDeSelecciónDeMenu) {
                case 1 :
                    Coche seatIbiza     = new Coche("Ibiza",      95, 2024, "Rojo",    "Chakir", 4, "0002DEF");
                    Coche toyotaCorolla = new Coche("Corolla",   122, 2025, "Blanco",  "Mohamed", 4, "0003GHI");
                    Coche bmwSerie3     = new Coche("Serie 3",   150, 2023, "Azul",    "Serroukh", 4, "0004JKL");
                    Coche audiA3        = new Coche("A3",        116, 2022, "Gris",    "Serroukh", 4, "0005MNO");
                    break;
                case 2 :
                    Moto yamahaMt07    = new Moto("MT-07",   73, 2023, "Negro",  "Chakir",  2, "M-1002-DEF");
                    Moto kawasakiZ650  = new Moto("Z650",    67, 2022, "Verde",  "Serroukh",2, "M-1003-GHI");
                    Moto bmwG310R      = new Moto("G 310 R", 34, 2025, "Azul",   "Mohamed", 2, "M-1004-JKL");
                    Moto ducatiMonster = new Moto("Monster", 82, 2026, "Rojo",   "Chakir",  2, "M-1005-MNO");
                    break;
                case 3 :
                    chakir.mostrarCochesEnPropiedad();
                    break;
                case 4 :
                    System.out.println("numero 4");
                    break;
                case 5 :
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
        Concesionario concesionario = new Concesionario();



        //concesionario.crearCoches();
        //Coche renaultMegane = new Coche("Megane", 110, 2026, "Negro", "Chakir", 4, "0001ABC");
        

        //concesionario.crearMotos();
        //Moto hondaPcx125   = new Moto("PCX 125", 12, 2024, "Blanco", "Mohamed", 2, "M-1001-ABC");
        
        Coche coche1 = concesionario.crearCoches();
        Moto moto1 = concesionario.crearMotos();

        coche1.arrancar();
        coche1.apagar();
        coche1.bajarVentanilla();

        moto1.arrancar();
        moto1.apagar();
        moto1.hacerCaballito(moto1);


    }
}
