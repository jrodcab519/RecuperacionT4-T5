package Ejercicio1;

public class P1Principal {
    public static void main(String[] args) {

        Elfo elfo1 = new Elfo("Legolas", 2500);
        elfo1.realizarAcion();

        Dragon dragon1 = new Dragon("Smaugh", 1225);
        dragon1.realizarAcion();
        dragon1.volar();

        HombreLobo hombreLobo1 = new HombreLobo("Lupín", 35);
        hombreLobo1.realizarAcion();

        Mago mago1 = new Mago("Saruman", 1250, 48);
        mago1.realizarAcion();

        Mago mago2 = new Mago("Gandalf", 1387, 56);
        mago2.realizarAcion();
    }
}
