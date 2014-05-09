package ubu.gii.dass.refactoring;

public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(Movie movie, int daysRented);

	public abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(Movie movie, int daysRented) {
		// add frequent renter points
		int frequentRenterPoints = 1;;
		// add bonus for a two day new release rental
		if ((movie.getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
}
