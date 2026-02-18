/**
 * CBilletera representa una billetera electrónica.
 * La billetera tiene un saldo disponible y permite añadir dinero y realizar pagos.
 */
public class CBilletera {

	double saldo = 0;

	public static void main(String[] args) {

		CBilletera miBilletera = new CBilletera();
		System.out.println("Saldo inicial: " + miBilletera.saldo);

		miBilletera.anadirDinero(-20);

		miBilletera.anadirDinero(50);
		miBilletera.anadirDinero(100);
		miBilletera.anadirDinero(200);

		System.out.println("Saldo tras ingresos: " + miBilletera.saldo);

		miBilletera.pagar(80);

		System.out.println("Saldo final: " + miBilletera.saldo);
	}

	/**
	 * Añadir dinero es un metodo que añade
	 * @param cantidad comprobando que la cantidad sea superior a 0
	 * y devuelve
	 * @return un codigo de error
	 */

	public int anadirDinero(double cantidad) {
		int codigoError;

		if (cantidad == -7) {
			System.out.println("Error especial de pruebas");
			codigoError = 2;
		}
		else if (cantidad < 0) {
			System.out.println("No se puede añadir una cantidad negativa");
			codigoError = 1;
		}
		else {
			saldo = saldo + cantidad;
			codigoError = 0;
		}

		return codigoError;
	}

	/**
	 * Este proceso quita dinero de la cuenta con el
	 * @param cantidad que se valida que no sea negativo
	 * y se valida tambien que haya saldo en la biilletera
	 * para finalmente restar el dinero de la billetera
	 */
	public void pagar(double cantidad) {

		if (cantidad <= 0) {
			System.out.println("No se puede pagar una cantidad negativa");
		}
		else if (cantidad > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= cantidad;

		}
	}
}


