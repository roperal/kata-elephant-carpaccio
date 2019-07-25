package com.kata.elephant;

public class CalculatorInterface {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		double totalPrice = calculatePrice(args, calculator);

		if (args.length > 2) {
			totalPrice = applyTax(totalPrice, args[2]);
		}

		totalPrice = applyDiscount(totalPrice);

		System.out.print(totalPrice);
	}

	private static double applyDiscount(double totalPrice) {
		if (totalPrice >= 50000) {
			return totalPrice * 0.85;
		} else if (totalPrice >= 10000) {
			return totalPrice * 0.90;
		} else if (totalPrice >= 7000) {
			return totalPrice * 0.93;
		} else if (totalPrice >= 5000) {
			return totalPrice * 0.95;
		} else if (totalPrice >= 1000) {
			return totalPrice * 0.97;
		} else {
			return totalPrice;
		}
	}

	private static double applyTax(double totalPrice, String state) {

		if (state.equals("UT")) {
			return totalPrice * 1.0685;
		} else if (state.equals("NV")) {
			return totalPrice * 1.08;
		} else if (state.equals("TX")) {
			return totalPrice * 1.0625;
		} else if (state.equals("AL")) {
			return totalPrice * 1.04;
		} else if (state.equals("CA")) {
			return totalPrice * 1.0825;
		}
		return totalPrice;
	}

	private static double calculatePrice(String[] args, Calculator calculator) {
		return calculator.totalPrice(Double.valueOf(args[0]), Double.valueOf(args[1]));
	}

}
