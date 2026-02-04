package com.sinensia;

public class Concesionario {
    
    //esta se encarga de crear los vehículos

    public Coche crearCoches(){
        
        Coche renaultMegane = new Coche("Megane", 110, 2026, "Negro", "Chakir", 4, "0001ABC");
        //Coche seatIbiza     = new Coche("Ibiza",      95, 2024, "Rojo",    "Chakir", 4, "0002DEF");
        //Coche toyotaCorolla = new Coche("Corolla",   122, 2025, "Blanco",  "Mohamed", 4, "0003GHI");
        //Coche bmwSerie3     = new Coche("Serie 3",   150, 2023, "Azul",    "Serroukh", 4, "0004JKL");
        //Coche audiA3        = new Coche("A3",        116, 2022, "Gris",    "Serroukh", 4, "0005MNO");
        return renaultMegane;
    }

    public Moto crearMotos(){
        
        Moto hondaPcx125   = new Moto("PCX 125", 12, 2024, "Blanco", "Mohamed", 2, "M-1001-ABC");
        //Moto yamahaMt07    = new Moto("MT-07",   73, 2023, "Negro",  "Chakir",  2, "M-1002-DEF");
        //Moto kawasakiZ650  = new Moto("Z650",    67, 2022, "Verde",  "Serroukh",2, "M-1003-GHI");
        //Moto bmwG310R      = new Moto("G 310 R", 34, 2025, "Azul",   "Mohamed", 2, "M-1004-JKL");
        //Moto ducatiMonster = new Moto("Monster", 82, 2026, "Rojo",   "Chakir",  2, "M-1005-MNO");
        return hondaPcx125;
    }

    
}
