package Ejercicio2;

import java.util.ArrayList;

public class Fiesta {
    int glamur;
    int aforo;

    ArrayList<Invitado> fiesta;

    public Fiesta(int aforo) {
        this.glamur = 0;
        this.aforo = aforo;
        fiesta = new ArrayList<>();
    }

    public void entrar(Invitado invitado) throws AforoCompletoException {
        if(fiesta.size() + 1 > aforo){
            throw  new AforoCompletoException("Aforo completo, " + invitado + " nopuede entrar.");
        }else {
            fiesta.add(invitado);
            this.glamur = glamur + invitado.fama;
            System.out.println(invitado.nombre + " ha entrado a la fiesta.");
        }
    }

    public void salir(Invitado invitado) throws InvitadoIncorrectoException {
        if(fiesta.contains(invitado)){
            this.glamur = glamur - invitado.fama;
            fiesta.remove(invitado);
            System.out.println(invitado.nombre + " ha salido de la fiesta.");
        }else{
            throw new InvitadoIncorrectoException();
        }
    }

    public int getGlamur() {
        return glamur;
    }

    public int getAforo() {
        return aforo;
    }

    public int getFiesta() {
        return fiesta.size();
    }


    @Override
    public String toString() {
        return "Fiesta{" +
                "glamur=" + glamur +
                ", aforo=" + aforo +
                '}';
    }
}
