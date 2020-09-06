package no.hvl.dat108;

public class Klient {
	public static void main(String[] args) {
        Rutsjebane r = new Rutsjebane();

        Kokk k1 = new Kokk(r, 1);
        Kokk k2 = new Kokk(r, 2);
        Kokk k3 = new Kokk(r, 3);


        Servitor c1 = new Servitor(r, 1);
        Servitor c2 = new Servitor(r, 2);

        k1.start();
        k2.start();
        k3.start();

        c1.start();
        c2.start();

    }
}
