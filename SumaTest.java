package paquete1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void sumaPositivos() { //comprobacion de la suma de numeros positivos
		System.out.println("Sumando dos numeros positivos...");
		Suma s=new Suma(2,3);
		int resultadoEsperado=5;
		
		assertEquals(resultadoEsperado, s.sumar());
	}
		
	@Test
	public void sumaNegativos() { // comprobacion de la suma de numeros negativos
		System.out.println("Sumando dos numeros negativos...");
		Suma t=new Suma(-2,-3);
		int resultadoEsperado=-5;
			
		assertEquals(resultadoEsperado, t.sumar());
	}
		
	@Test
	public void sumaPositivoNegativo() { // comprobacion de la suma de numeros positivos y negativos
		System.out.println("Sumando de numeros negativos y positivos...");
		Suma u=new Suma(+2,-3);
		int resultadoEsperado=-1;
				
		assertEquals(resultadoEsperado, u.sumar());

		
	}
// Comentario añadido por Jesús Avilés Martínez
}
