package ubu.gii.dass.refactoring;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	public double getCharge(Movie movie, int daysRented){
		return getCharge(daysRented);
	}

	public double getCharge(int daysRented){
		double result = 0;
		result += daysRented * 3;
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		int frequentRenterPoints = 1;
		
		// add bonus for a two day new release rental
		if (daysRented > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

}
