package no.hvl.dat108.Oppgave1;

import javax.swing.JOptionPane;

public class Input implements Runnable {

    @Override
    public void run() {
        while (!Main.verdi.equals("quit")) {
            Main.verdi = JOptionPane.showInputDialog("Input verdi (quit for å avslutte)");
        }
    }
}
