package oppg2.no.hvl.dat108;

public class Main {

    public static String verdi = "Hallo verden!";

    public static void main(String[] args) {

        Thread input = new Thread(new Input());
        Thread print = new Thread(new Print());
        input.start();
        print.start();

    }
}
