package Ejercicio2;

import java.util.ArrayList;

public abstract class Invitado {
    String nombre;
    int fama;

    ArrayList<Fiesta> fiesta;

    public Invitado(String nombre, int fama) {
        this.nombre = nombre;
        this.fama = fama;
        fiesta = new ArrayList<>();
    }

    @Override
    public String toString() {
        return nombre + " (" + fama + ")";
    }
}
