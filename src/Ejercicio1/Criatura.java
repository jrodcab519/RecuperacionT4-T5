package Ejercicio1;

public abstract class Criatura {
    private String nombre;
    private int edad;
    private int nivelEnergia;

    public Criatura(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if(nombre.isBlank() || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws IllegalArgumentException {
        if(edad < 0){
            throw new IllegalArgumentException("La edad tiene que ser mayor que 0");
        }else {
            this.edad = edad;
        }
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    abstract void realizarAcion();
}
