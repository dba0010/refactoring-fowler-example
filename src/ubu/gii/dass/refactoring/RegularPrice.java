package ubu.gii.dass.refactoring;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	
	public double getCharge(Movie movie, int daysRented){
		return getCharge(daysRented);
	}

	public double getCharge(int daysRented){
		double result = 0;
		result += 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}

}
