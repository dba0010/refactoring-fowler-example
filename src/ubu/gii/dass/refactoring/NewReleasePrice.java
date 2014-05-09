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

}
