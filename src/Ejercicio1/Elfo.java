package Ejercicio1;

public class Elfo extends Criatura{

    public Elfo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void realizarAcion() {
        System.out.println(getNombre() + " dispara una felcha mágica.");
    }


}
