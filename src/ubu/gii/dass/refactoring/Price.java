package ubu.gii.dass.refactoring;

public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(Movie movie, int daysRented);
}
