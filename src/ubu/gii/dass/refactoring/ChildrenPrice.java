package ubu.gii.dass.refactoring;

public class ChildrenPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	public double getCharge(Movie movie, int daysRented) {
		return getCharge(daysRented);
	}

	public double getCharge(int daysRented) {
		double result = 0;
		result += 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}

	public int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		int frequentRenterPoints = 1;
		return frequentRenterPoints;
	}

}
