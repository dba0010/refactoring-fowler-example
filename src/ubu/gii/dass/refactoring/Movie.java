package ubu.gii.dass.refactoring;

/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	private Price _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _priceCode.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {

		case CHILDRENS:
			_priceCode = new ChildrenPrice();
			break;
		case REGULAR:
			_priceCode = new RegularPrice();
			break;
		case NEW_RELEASE:
			_priceCode = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Código inválido.");
		}
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(Rental rental) {
		return getCharge(rental);
	}

	public double getCharge(int daysRented) {
		double result = 0;
		// determine amounts for each line
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRented > 2)
				result += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRented > 3)
				result += (daysRented - 3) * 1.5;
			break;
		}
		return result;
	}

	public int getFrequentRenterPoints(Rental rental) {
		return getFrequentRenterPoints(rental);
	}

	public int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		int frequentRenterPoints = 1;;
		// add bonus for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRented > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
}
