package com.formation.fulstatck;

public class Operation {

	public static void main(String[] args) {
		if (args.length > 1)
			try {
				Operation.mult(Double.valueOf(args[0]), Double.valueOf(args[1]));
			} catch (Exception e) {
				System.out.println("les valeurs sont mal introduites");
			}

	}

	static double mult(double op1, double op2) {
		return op1 * op2;
	}
}
