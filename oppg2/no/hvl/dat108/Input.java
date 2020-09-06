package oppg2.no.hvl.dat108;

import javax.swing.*;

public class Input implements Runnable {

    @Override
    public void run() {
        while (!Main.verdi.equals("quit")) {
            Main.verdi = JOptionPane.showInputDialog("Input verdi (quit for å avslutte)");
        }
    }
}
