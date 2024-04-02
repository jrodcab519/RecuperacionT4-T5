package Ejercicio1;

public class Mago extends Criatura{

    int nivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }

    @Override
    void realizarAcion() {
        if(nivelMagico >= 50){
            System.out.println(getNombre() + " lanza un poderoso hechizo.");
        }else{
            System.out.println(getNombre() + " genera una pequeña chispa.");
        }
    }
}
