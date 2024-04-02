package Ejercicio1;

public class HombreLobo extends Criatura{

    public HombreLobo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void realizarAcion() {
        System.out.println(getNombre() + " aúlla a la luna.");

    }
}
