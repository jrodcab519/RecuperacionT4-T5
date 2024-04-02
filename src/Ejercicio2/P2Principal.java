package Ejercicio2;

public class P2Principal {
    public static void main(String[] args) throws AforoCompletoException, InvitadoIncorrectoException {
        InvitadoNormal normal = new InvitadoNormal("Juan");
        System.out.println(normal);

        InvitadoVIP vip = new InvitadoVIP("José");
        System.out.println(vip);

        Fiesta fiesta = new Fiesta(2);
        System.out.println(fiesta);

        fiesta.entrar(normal);
        fiesta.entrar(vip);
        System.out.println(fiesta);

        System.out.println("El glamur de la fiesta es de : " + fiesta.getGlamur());
        System.out.println("El Aforo de la fiesta es de: " + fiesta.getAforo());
        System.out.println("El número de invitados actuales de la fiesta es de: " + fiesta.getFiesta());


        fiesta.salir(normal);

        System.out.println(fiesta);

        System.out.println("El glamur de la fiesta es de : " + fiesta.getGlamur());
        System.out.println("El Aforo de la fiesta es de: " + fiesta.getAforo());
        System.out.println("El número de invitados actuales de la fiesta es de: " + fiesta.getFiesta());

    }

}
