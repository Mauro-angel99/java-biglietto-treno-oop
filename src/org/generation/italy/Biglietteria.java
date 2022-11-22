package org.generation.italy;

import java.util.Scanner;

public class Biglietteria {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("numero km:");
	     int km = sc.nextInt();
	     
	     System.out.println("età:");
	     int age = sc.nextInt();
	     
	     try {
	    	 
	     Biglietto biglietto = new Biglietto(km, age);
	     System.out.println(biglietto.toString());
	     
	     }catch(Exception e) {
	    	 
	    	 System.err.println(e.getMessage());
	    	 
	     }
	     
	}


}

