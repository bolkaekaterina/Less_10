package by.htp.less10.presentation;

import by.htp.less10.entity.Fraction;

public class FractionView {

	public void printSum(Fraction f1, Fraction f2, Fraction f3) {

		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " + " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}

	public void printSubstract(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " - " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}

	public void printDivision(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " : " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}

	public void printMultiplication(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " * " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}

}
