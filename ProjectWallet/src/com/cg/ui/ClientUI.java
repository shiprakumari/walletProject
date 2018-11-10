package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		System.out.println("-----XYZ PAYMENT WALLET-------");
		System.out.println(" Create Account ");
		System.out.println(" Show Balance ");
		System.out.println(" Withdraw Amount ");
		System.out.println(" Deposit Amount ");
		System.out.println(" FundTransfer ");
		System.out.println(" Print Transaction ");
		System.out.println(" Exit");
		System.out.println("Enter your option");
		int option = sc.nextInt();
		
		
	}

}
