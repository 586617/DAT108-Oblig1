package no.hvl.dat108.Oppgave1;

public class Print implements Runnable {

    @Override
    public void run() {
        while (!Main.verdi.equals("quit")) {
            System.out.println(Main.verdi);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
