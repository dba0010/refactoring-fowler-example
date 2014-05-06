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
}
