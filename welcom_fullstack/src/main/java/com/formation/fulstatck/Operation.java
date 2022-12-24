package com.formation.fulstatck;

public class Operation {

	public static void main(String[] args) {
		double variable = 0;
		try {
			if (args.length > 1)
				variable = Double.valueOf(args[0]) * Double.valueOf(args[1]);
			System.out.print("resulats  = " + variable);
		} catch (Exception e) {
			System.out.println("les valeurs sont mal introduites");
		}
	}

}
