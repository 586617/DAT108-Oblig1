package no.hvl.dat108;

public class Servitor extends Thread {

    private final int number;
    private final Rutsjebane rutsjebane;

    public Servitor(Rutsjebane rutsjebane, int number) {
    	this.number = number;
        this.rutsjebane = rutsjebane;
    }

    public void run() {

    	while(true) {
	        try {
	        	sleep((long) (Math.random() * 4000) + 2000);
	       	} catch (InterruptedException e) {
	
	        }
	        rutsjebane.taAvBurger(this);	
        }   
    }

    @Override
    public String toString() {
        return "Servitør" + number;
    }
}
