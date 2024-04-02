package Ejercicio1;

public class Dragon extends Criatura implements Volar{

    public Dragon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void realizarAcion() {
        System.out.println(getNombre() + " escupe fuego.");
    }


    @Override
    public void volar() {
        System.out.println(getNombre() + " vuela ágilmente sobre los árboles.");
    }
}
