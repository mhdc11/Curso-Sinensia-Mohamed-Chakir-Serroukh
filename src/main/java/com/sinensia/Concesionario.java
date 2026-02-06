package com.sinensia;
import java.util.List;
import java.util.ArrayList;

public class Concesionario {
    
    public String nombreConcesionario;
    //esta se encarga de crear los vehículos
    public List <Coche> listaCochesEnVenta = new ArrayList<>();
    public List <Moto> listaMotosEnVenta = new ArrayList<>();
    public int [] listaDeCochesVendidos;
    public int [] listaDeMotosVendidos;
    

    public Concesionario(String NombreConcesionario){
        this.nombreConcesionario = nombreConcesionario;
        crearCoches();
        crearMotos();
    }

    public void crearCoches(){
        
        
        Coche renaultMegane   = new Coche("Megane",     15500, 110, 2026, "Negro",   "Chakir", 4, "0001ABC");
        Coche seatIbiza       = new Coche("Ibiza",      12000, 95,  2024, "Blanco",  "Chakir", 4, "0002ABC");
        Coche vwGolf          = new Coche("Golf",       21000, 150, 2025, "Gris",    "Chakir", 4, "0003ABC");
        Coche fordFocus       = new Coche("Focus",      17500, 120, 2023, "Azul",    "Chakir", 4, "0004ABC");
        Coche peugeot308      = new Coche("308",        16500, 130, 2024, "Rojo",    "Chakir", 4, "0005ABC");
        Coche bmwSerie1       = new Coche("Serie 1",    28000, 170, 2026, "Negro",   "Chakir", 4, "0006ABC");
        Coche audiA3          = new Coche("A3",         27000, 160, 2025, "Blanco",  "Chakir", 4, "0007ABC");
        Coche mercedesClaseA  = new Coche("Clase A",    30000, 180, 2026, "Gris",    "Chakir", 4, "0008ABC");
        Coche toyotaCorolla   = new Coche("Corolla",    19000, 140, 2024, "Azul",    "Chakir", 4, "0009ABC");
        Coche hyundaiI30      = new Coche("i30",        15000, 110, 2023, "Rojo",    "Chakir", 4, "0010ABC");

        listaCochesEnVenta.add(renaultMegane);
        listaCochesEnVenta.add(seatIbiza);
        listaCochesEnVenta.add(vwGolf);
        listaCochesEnVenta.add(fordFocus);
        listaCochesEnVenta.add(peugeot308);
        listaCochesEnVenta.add(bmwSerie1);
        listaCochesEnVenta.add(audiA3);
        listaCochesEnVenta.add(mercedesClaseA);
        listaCochesEnVenta.add(toyotaCorolla);
        listaCochesEnVenta.add(hyundaiI30);

        listaDeCochesVendidos = new int [listaCochesEnVenta.size()];
    

    }

    public void crearMotos(){
        
        
        Moto yamahaR1 = new Moto("R1", 22000, 200, 2025, "Azul", "Chakir", 2, "M001ABC");
        Moto kawasakiNinja = new Moto("Ninja ZX-10R", 21000, 203, 2024, "Verde", "Chakir", 2, "M002ABC");
        Moto hondaCBR = new Moto("CBR 1000RR", 19500, 190, 2023, "Rojo", "Chakir", 2, "M003ABC");
        Moto suzukiGsxR = new Moto("GSX-R1000", 18500, 185, 2024, "Azul", "Chakir", 2, "M004ABC");
        Moto ducatiPanigale = new Moto("Panigale V4", 28000, 215, 2026, "Rojo", "Chakir", 2, "M005ABC");
        Moto bmwS1000rr = new Moto("S1000RR", 26000, 207, 2025, "Blanco", "Chakir", 2, "M006ABC");
        Moto ktmDuke = new Moto("1290 Super Duke", 17000, 180, 2024, "Naranja", "Chakir", 2, "M007ABC");
        Moto yamahaMT09 = new Moto("MT-09", 10500, 119, 2023, "Negro", "Chakir", 2, "M008ABC");
        Moto hondaCB650 = new Moto("CB650R", 9800, 95, 2023, "Gris", "Chakir", 2, "M009ABC");
        Moto kawasakiZ900 = new Moto("Z900", 10200, 125, 2024, "Verde", "Chakir", 2, "M010ABC");

        listaMotosEnVenta.add(yamahaR1);
        listaMotosEnVenta.add(kawasakiNinja);
        listaMotosEnVenta.add(hondaCBR);
        listaMotosEnVenta.add(suzukiGsxR);
        listaMotosEnVenta.add(ducatiPanigale);
        listaMotosEnVenta.add(bmwS1000rr);
        listaMotosEnVenta.add(ktmDuke);
        listaMotosEnVenta.add(yamahaMT09);
        listaMotosEnVenta.add(hondaCB650);
        listaMotosEnVenta.add(kawasakiZ900);

        listaDeMotosVendidos = new int [listaMotosEnVenta.size()];


   
    }


    public void mostrarListaDeCochesDisponibles(){
        
        for (int i = 0; i < this.listaCochesEnVenta.size(); i++) {
            System.out.println(listaCochesEnVenta.get(i).getModelo());
        }

    }

    public void mostrarListaDeMotosDisponibles(){
        for (int i = 0; i < this.listaMotosEnVenta.size(); i++) {
            System.out.println(listaMotosEnVenta.get(i).getModelo());
        }
        
    }
    
}
