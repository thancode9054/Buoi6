package Bai5;

public class kq {
    public static void main(String[] args) {
        Rational fraction1 = new Rational(2, 3);
        Rational fraction2 = new Rational(3, 4);

        Rational reducedFraction1 = fraction1.reduce();
        Rational reducedFraction2 = fraction2.reduce();

        Rational reciprocal1 = fraction1.reciprocal();
        Rational reciprocal2 = fraction2.reciprocal();

        Rational sum = fraction1.add(fraction2);
        Rational difference = fraction1.subtract(fraction2);
        Rational product = fraction1.multiply(fraction2);
        Rational quotient = fraction1.divide(fraction2);

        boolean isEqual = fraction1.equals(fraction2);

        System.out.println("Fraction 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Fraction 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        System.out.println(
                "Reduced Fraction 1: " + reducedFraction1.getNumerator() + "/" + reducedFraction1.getDenominator());
        System.out.println(
                "Reduced Fraction 2: " + reducedFraction2.getNumerator() + "/" + reducedFraction2.getDenominator());

        System.out.println("Reciprocal Fraction 1: " + reciprocal1.getNumerator() + "/" + reciprocal1.getDenominator());
        System.out.println("Reciprocal Fraction 2: " + reciprocal2.getNumerator() + "/" + reciprocal2.getDenominator());

        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());

        System.out.println("Fraction 1 equals Fraction 2: " + isEqual);
    }

}