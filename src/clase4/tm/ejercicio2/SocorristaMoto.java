package clase4.tm.ejercicio2;

public class SocorristaMoto implements Socorrista<Moto> {

    @Override
    public void socorrer(Moto unaMoto) {
        System.out.println("Socorriendo moto " + unaMoto.getPatente());
    }
}
