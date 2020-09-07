package no.hvl.dat108.Oppgave2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Rutsjebane {
	
	private final static int SIZE = 5;

    private final Queue<Burger> burgere = new ArrayDeque<>();

    public void leggPaaBurger(Kokk kokk, Burger burger) {
    	synchronized (this) {
	    	if (burgere.size() >= SIZE) {
	    		System.out.printf("%s er klar med hamburger, men rutsjebanen er full. Venter!\n", kokk);
	    		try {
	    			wait();
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	    	} else {
	    		notify();
		    	System.out.printf("%s legger p� burger%s => %s\n", kokk, burger, burgere);
		    	burgere.add(burger);
		 
	    	}	
	    }
    }

    public void taAvBurger(Servitor servitor) {
    	synchronized (this) {
	        if (burgere.size() == 0) {
	        	System.out.printf("%s vil ta en hamburger, men rutsjebanen er tom. Venter!\n", servitor);
	        	try {
	    			wait();
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	        } else {
	        	notify();
	        	Burger burger = burgere.remove();
		        System.out.printf("%s tar av burgere%s <= %s\n", servitor, burger, burgere);
		        
	        }
    	}
    }
}