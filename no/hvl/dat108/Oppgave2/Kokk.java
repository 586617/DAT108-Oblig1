package no.hvl.dat108;

public class Kokk extends Thread {

    private int number;

    private final Rutsjebane rutsjebane;

    public Kokk(Rutsjebane rutsjebane, int number) {
    	this.number = number;
        this.rutsjebane = rutsjebane;
      
    }

	public void run() {
		while(true) {
			try {
	           sleep((long)(Math.random() * 4000) + 2000);
			} catch (InterruptedException e) {

            }
            rutsjebane.leggPaaBurger(this, new Burger());
        }
    }

	@Override
	public String toString() {
		return "Kokk" + number;
	}
}