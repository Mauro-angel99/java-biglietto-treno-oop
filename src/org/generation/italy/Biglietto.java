package org.generation.italy;


import java.math.BigDecimal;

public class Biglietto {
	
	
	private int km;
	private int age;
	BigDecimal costKm = new BigDecimal(0.21);
	BigDecimal overScount = new BigDecimal(0.40);
	BigDecimal underScount = new BigDecimal(0.20);	
	int underage = 18;
	int over = 65;
	
    public Biglietto(int km, int age) throws Exception {
    	setKm(km);
		setAge(age);
       
	}
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) throws Exception {
		
		if (!isValidKm(km)) {
			
			throw new Exception("I km inseriti non sono validi");
		}
		
		this.km = km;
	}
	
	private boolean isValidKm(int km) {
		
		return km >= 0;
		
	}
	
	public int getAge() {
		return age;
	}

    public void setAge(int age) throws Exception {
		
		if (!isValidAge(age)) {
			
			throw new Exception("l'età inserita non è valida");
		}
		
		this.age = age;
	}
	
	private boolean isValidAge(int age) {
		
		return age >= 0;
		
	}
	
	
	public float costTicket() {
		
		BigDecimal kmbd = new BigDecimal(km);
		BigDecimal agebd = new BigDecimal(age);
		
		costKm = costKm.multiply(kmbd); 
	     
	     
	     if (age < underage) {
	    	 underScount = underScount.multiply(costKm);
	    	 costKm = costKm.subtract(underScount);
	    	 return costKm.floatValue();
	     }else if(age > over) {
	    	 overScount = overScount.multiply(costKm);
	    	 costKm = costKm.subtract(overScount);;
	    	 return costKm.floatValue();
	     }else {
	         return costKm.floatValue();
	     }
	     
	}
	
	@Override
	public String toString() {
		
		return  "il prezzo è: " + costTicket();
	}
	

}

	
	

