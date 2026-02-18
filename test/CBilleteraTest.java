import static org.junit.jupiter.api.Assertions.*;

class CBilleteraTest {

	@org.junit.jupiter.api.Test
	void main() {
	}

	@org.junit.jupiter.api.Test
	void anadirDinero() {
		CBilletera miBilletera1 = new CBilletera();
		double introducida1 = 2;
		//-deberemos probar tambien si se añade la cantidad correcta y se suma en el saldo
		miBilletera1.anadirDinero(introducida1);
		assertEquals(introducida1,miBilletera1.saldo);
		miBilletera1.pagar(introducida1);

		//-deberemos probar que pasa si la cantidad es negativa
		miBilletera1.anadirDinero(-1);
		assertEquals(0,miBilletera1.saldo);

		//-verificaremos que el codigo de error sea 1 si ponemos cantidad negativa
		assertEquals(1,miBilletera1.anadirDinero(-1));

		//-podremos probar tambien para el error especial de prueba -7
		assertEquals(2,miBilletera1.anadirDinero(-7));

	}


	@org.junit.jupiter.api.Test
	void pagar() {
		CBilletera miBilletera1 = new CBilletera();
		miBilletera1.anadirDinero(100);

		//-Comprobaremos si el numero no es negativo ej -1
		miBilletera1.pagar(-1);
		assertEquals(100,miBilletera1.saldo);

		//-Comprobaremos si hay suficiente saldo
		miBilletera1.pagar(101);
		assertEquals(100,miBilletera1.saldo);

		//-Comprobaremos que la resta se hace de forma adecuada
		miBilletera1.pagar(99);
		assertEquals(1,miBilletera1.saldo);

		//-probaremos pagar decimales
		miBilletera1.pagar(0.1);
		assertEquals(0.9,miBilletera1.saldo);
	}
}