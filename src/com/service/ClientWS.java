package com.service;

public class ClientWS {

	public static void main(String[] args) {
		// Recuperation de proxy pour pourvoir utiliser les methode.
		//la classe principale est en general materialiser par une interface
		
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
		double res = stub.convertionCfatoEuro(600);
		System.out.println(res);
		
		System.out.println("---------------------");
		
		BanqueEntity cp = stub.recupCompte(1);
		System.out.println(cp.getCode());

	}

}
