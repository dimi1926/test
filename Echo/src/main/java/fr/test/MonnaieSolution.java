package fr.test;

public class MonnaieSolution {
    	static Monnaie monnaieOptimale(long s) {
    		long change = s;
    	    Monnaie c = new Monnaie();
    	    if (change >=10) {
    	        if (change % 2 != 0 && change % 5 !=0) {
    	            return c;
    	        }
    	        else {
    	            c.billet10 = (long) change / 10;
    	            change = change % 10;
    	            System.out.println(change);
    	        }
    	    }

    	    if (change <10 && change >=5) {
    	        if (change % 2 == 0) {
    	            c.billet5 = 0;
    	            c.piece2 = change/2;
    	        }
    	        else {
    	            change = change - 5;
    	            c.billet5 = 1;
    	        }
    	    }

    	    if (change %2 ==0) {
    	        c.piece2 = change/2;
    	    } else {
    	    	return c;
    	    }
    	    return c; 
    	}
    
}
