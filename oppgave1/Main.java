package oppgave1;

import javax.swing.*;

public class Main {

    public static String verdi = "Hallo verden!";

    public static void main(String[] args) {

        Thread input = new Thread(new Input());
        Thread print = new Thread(new Print());
        input.start();
        print.start();

    }
}
